package test.swl.com.myapplication.retrofit.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import test.swl.com.myapplication.retrofit.DownLoadListener;
import test.swl.com.myapplication.retrofit.LoadResponseBody;

/**
 * @desc   //添加进度条展示
 * @auth ${user}
 * @time 2018/3/16  13:59
 */

public class DownLoadInterceptor implements Interceptor {
    public DownLoadListener mLoadListener;

    public DownLoadInterceptor(DownLoadListener loadListener) {
        mLoadListener = loadListener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        Response build = response.newBuilder().body(new LoadResponseBody(response.body(), mLoadListener))
                .build();
        return build;
    }
}
