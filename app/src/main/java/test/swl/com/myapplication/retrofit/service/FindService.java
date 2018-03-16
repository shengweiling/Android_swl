package test.swl.com.myapplication.retrofit.service;

import java.util.HashMap;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;
import test.swl.com.myapplication.modle.FindHomepageBottomBean;
import test.swl.com.myapplication.modle.FindHomepageTopBean;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/14  17:10
 */

public interface FindService {
    @POST("find/article")
    @FormUrlEncoded
    Observable<FindHomepageBottomBean> getListData(@FieldMap HashMap<String,String > params);

    @POST("find/advertAndRecommend")
    @FormUrlEncoded
    Observable<FindHomepageTopBean> getTopDate(@FieldMap HashMap<String,String > params);
}
