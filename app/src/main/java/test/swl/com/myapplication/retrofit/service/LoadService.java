package test.swl.com.myapplication.retrofit.service;



import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/16  9:54
 */

public interface LoadService {
    @GET
    @Streaming
    Observable<ResponseBody> dowanLoadApk(@Url String url);
}
