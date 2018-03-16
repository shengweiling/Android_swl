package test.swl.com.myapplication.retrofit.manager;

import android.os.Environment;
import android.support.annotation.NonNull;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import test.swl.com.myapplication.retrofit.DownLoadListener;
import test.swl.com.myapplication.retrofit.interceptor.DownLoadInterceptor;
import test.swl.com.myapplication.retrofit.service.LoadService;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/16  14:05
 */

public class DownLoadRetorfitServiceManager {
    private static final int DEFAULT_TIMEOUT = 15;

    private Retrofit retrofit;

    private DownLoadListener loadListener;

    private String baseUrl;

    private String downloadUrl;

    private static DownLoadRetorfitServiceManager mServiceManager;

    private DownLoadRetorfitServiceManager(String baseUrl, DownLoadListener loadListener) {
        this.baseUrl = baseUrl;
        this.loadListener = loadListener;
        DownLoadInterceptor interceptor = new DownLoadInterceptor(loadListener);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .retryOnConnectionFailure(true).connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder().baseUrl(baseUrl).client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static DownLoadRetorfitServiceManager getSingleInstance(String baseUrl, DownLoadListener loadListener) {
        if (null == mServiceManager) {
            synchronized (DownLoadRetorfitServiceManager.class) {
                if (null == mServiceManager) {
                    mServiceManager = new DownLoadRetorfitServiceManager(baseUrl, loadListener);
                }
            }
        }
        return mServiceManager;
    }

    public void downLoad(@NonNull String url, final String filePath, Subscriber subscriber) {
        loadListener.startLoad();
        retrofit.create(LoadService.class).dowanLoadApk(url)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())

                .map(new Func1<ResponseBody, InputStream>() {
                    @Override
                    public InputStream call(ResponseBody responseBody) {
                        return responseBody.byteStream();
                    }
                }).observeOn(Schedulers.computation()).doOnNext(new Action1<InputStream>() {
            @Override
            public void call(InputStream inputStream) {
                writeFile(inputStream, filePath);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    private void writeFile(InputStream inputStream, String filePath) {
        File file = new File(Environment.getExternalStorageDirectory(), filePath);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream ous = null;
        try {
            ous = new FileOutputStream(file);
            byte[] b = new byte[1024];
            int len;
            while ((len = inputStream.read(b)) != -1) {
                ous.write(b, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("swl", e.getMessage());
        } finally {
            try {
                inputStream.close();
                ous.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
