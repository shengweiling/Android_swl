package test.swl.com.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import okhttp3.OkHttpClient;
import rx.Subscriber;
import rx.functions.Action1;
import test.swl.com.myapplication.manager.DownLoadRetorfitServiceManager;
import test.swl.com.myapplication.modle.FindHomepageBottomBean;
import test.swl.com.myapplication.modle.FindHomepageTopBean;
import test.swl.com.myapplication.modle.PersonInfoBean;
import test.swl.com.myapplication.retrofit.DownLoadListener;
import test.swl.com.myapplication.retrofit.Loader.BaseLoader;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://testapp.mcsports.cn:85/api/";
    private static final String LOAD_URL="http://dldir1.qq.com";
    private static final String TAG = "MainActivity";
    private LoadingDialog mLoadingDialog;
    String downloadUrl = "/qqmi/aphone_p2p/TencentVideo_V6.0.0.14297_848.apk";

    TextView mTextView;
    OkHttpClient.Builder builder;
    private DownLoadRetorfitServiceManager mManager;
    private DownLoadListener mLoadListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        initLoadService();
    }

    private void initLoadService() {
        mLoadListener = new DownLoadListener() {
            @Override
            public void startLoad() {
                if (null != mLoadingDialog) {
                    mLoadingDialog.setMsg("开始下载。。。");
                }
            }

            @Override
            public void onPregress(final int progress) {
                if (null != mLoadingDialog) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mLoadingDialog.setMsg("正在下载。。。");
                            mLoadingDialog.setProgress(progress);
                        }
                    });

                }
            }

            @Override
            public void loadFinish() {
                if (null != mLoadingDialog && mLoadingDialog.isShowing()) {
                    mLoadingDialog.dismiss();
                }
                installApk();
            }

            @Override
            public void loadError(String errorInfo) {
                if (null != mLoadingDialog) {
                    mLoadingDialog.setMsg(errorInfo);
                }
            }
        };
        mManager = DownLoadRetorfitServiceManager.getSingleInstance(LOAD_URL, mLoadListener);
    }



    public void top(View view) {
        HashMap<String, String> params = new HashMap<>();
        params.put("token", "MjI5OTg5fHZ4N2F6bWp3eHV8MTM0ODAxNTAzNzQ=");
        BaseLoader.getTopData(params).subscribe(new Action1<List<FindHomepageTopBean.ResponseBean.RecommendListBean>>() {
            @Override
            public void call(List<FindHomepageTopBean.ResponseBean.RecommendListBean> recommendListBeen) {
                mTextView.setText(recommendListBeen.toString());
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                mTextView.setText(throwable.getMessage());
            }
        });
    }

    public void bottom(View view) {

        HashMap<String, String> params = new HashMap<>();
        params.put("token", "MjI5OTg5fHZ4N2F6bWp3eHV8MTM0ODAxNTAzNzQ=");
        params.put("page", "1");
        params.put("pageSize", "5");
       BaseLoader.getListData(params).subscribe(new Action1<FindHomepageBottomBean>() {
           @Override
           public void call(FindHomepageBottomBean findHomepageBottomBean) {
               mTextView.setText(findHomepageBottomBean.getResponse().toString());
           }
       });


    }

    public void mine(View view){
        BaseLoader.getPerseonInfo("MjI5OTg5fHZ4N2F6bWp3eHV8MTM0ODAxNTAzNzQ=").subscribe(new Subscriber<PersonInfoBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(PersonInfoBean personInfoBean) {
               mTextView.setText(personInfoBean.getResponse().toString());
            }
        });
    }


    public void download(View view){
        if(null==mLoadingDialog){
            mLoadingDialog=new LoadingDialog.Builder(this).setCancelOutside(false).setCancelable(false)
                    .setMessage("准备下载。。。").create();
        }
        mLoadingDialog.show();
        mManager.downLoad(downloadUrl,"/tencent.apk", new Subscriber() {
            @Override
            public void onCompleted() {
                mLoadListener.loadFinish();
            }

            @Override
            public void onError(Throwable e) {
                mLoadListener.loadError(e.getMessage());
            }

            @Override
            public void onNext(Object o) {

            }
        });
    }
    private void installApk() {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setDataAndType(Uri.fromFile(new File(Environment.getExternalStorageDirectory() + "/tencent.apk")),"application/vnd.android.package-archive");
        startActivity(intent);
    }



}
