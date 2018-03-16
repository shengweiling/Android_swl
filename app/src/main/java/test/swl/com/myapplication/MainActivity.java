package test.swl.com.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import okhttp3.OkHttpClient;
import rx.Subscriber;
import rx.functions.Action1;
import test.swl.com.myapplication.modle.FindHomepageBottomBean;
import test.swl.com.myapplication.modle.FindHomepageTopBean;
import test.swl.com.myapplication.modle.PersonInfoBean;
import test.swl.com.myapplication.retrofit.Loader.BaseLoader;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL = "http://testapp.mcsports.cn:85/api/";
    private static final String TAG = "MainActivity";

    TextView mTextView;
    OkHttpClient.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);


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

            }
        });
    }


    public void download(View view){

    }

}
