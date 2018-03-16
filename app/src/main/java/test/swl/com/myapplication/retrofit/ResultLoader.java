package test.swl.com.myapplication.retrofit;

import rx.functions.Func1;
import test.swl.com.myapplication.modle.BaseBean;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/15  10:34
 */

public class ResultLoader<T> implements Func1<BaseBean<T>,T> {

    @Override
    public T call(BaseBean<T> tBaseBean) {
        if(!tBaseBean.isSucc()){
            throw new Fault(tBaseBean.getStatus(),tBaseBean.getMessage());
        }
        return tBaseBean.getData();

    }
}
