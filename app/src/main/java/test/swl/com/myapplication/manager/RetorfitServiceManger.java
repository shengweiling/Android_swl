package test.swl.com.myapplication.manager;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import test.swl.com.myapplication.retrofit.interceptor.HttpCommonInterceptor;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/14  16:49
 */

public class RetorfitServiceManger {
    private static final int DEFAULT_TIME_OUT = 5;//超时时间 5s
    private static final int DEFAULT_READ_TIME_OUT = 10;
    private static final String BASE_URL= "http://testapp.mcsports.cn:85/api/";
    private Retrofit mRetrofit;
    private RetorfitServiceManger(){
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS);
        builder.writeTimeout(DEFAULT_TIME_OUT,TimeUnit.SECONDS);
        builder.readTimeout(DEFAULT_READ_TIME_OUT,TimeUnit.SECONDS);
        HttpCommonInterceptor httpCommonInterceptor=new HttpCommonInterceptor.Builder()
//                .addHeaderParams("appVersion", AppInfoUtils.getAppVersionName())
                .addHeaderParams("client","Android").build();

        builder.addInterceptor(httpCommonInterceptor);
        mRetrofit=new Retrofit.Builder()
                .client(builder.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    private static class SingletonHolder{
        private static final  RetorfitServiceManger INSTANCE=new RetorfitServiceManger();
    }

    public static RetorfitServiceManger getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 获取对应的Service
     * @param service Service 的 class
     * @param <T>
     * @return
     */

    public <T>T create(Class<T> setvice){
        return mRetrofit.create(setvice);
    }
}
