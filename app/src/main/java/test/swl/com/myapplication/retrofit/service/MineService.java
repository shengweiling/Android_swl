package test.swl.com.myapplication.retrofit.service;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;
import test.swl.com.myapplication.modle.PersonInfoBean;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/15  9:56
 */

public interface MineService {
    @POST("user/userDetail")
    @FormUrlEncoded
    Observable<PersonInfoBean> getPersonInfo(@Field("token") String token);
}
