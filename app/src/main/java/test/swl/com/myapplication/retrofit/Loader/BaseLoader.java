package test.swl.com.myapplication.retrofit.Loader;


import java.util.HashMap;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;
import test.swl.com.myapplication.modle.FindHomepageBottomBean;
import test.swl.com.myapplication.modle.FindHomepageTopBean;
import test.swl.com.myapplication.modle.PersonInfoBean;
import test.swl.com.myapplication.retrofit.RetorfitServiceManger;
import test.swl.com.myapplication.retrofit.service.FindService;
import test.swl.com.myapplication.retrofit.service.MineService;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/15  10:13
 */

public class BaseLoader extends ObjectLoader {
    static FindService findService=RetorfitServiceManger.getInstance().create(FindService.class);
    public static Observable<PersonInfoBean> getPerseonInfo(String token){
        MineService mineService = RetorfitServiceManger.getInstance().create(MineService.class);
        return observe(mineService.getPersonInfo(token));
    }

    public static Observable<FindHomepageBottomBean> getListData(HashMap<String,String> params){

        return observe(findService.getListData(params));
    }

    public static Observable<List<FindHomepageTopBean.ResponseBean.RecommendListBean>> getTopData(HashMap<String,String> params){
        return observe(findService.getTopDate(params)).map(new Func1<FindHomepageTopBean, List<FindHomepageTopBean.ResponseBean.RecommendListBean>>() {
            @Override
            public List<FindHomepageTopBean.ResponseBean.RecommendListBean> call(FindHomepageTopBean findHomepageTopBean) {
                return findHomepageTopBean.getResponse().getRecommendList();
            }
        });
    }
}
