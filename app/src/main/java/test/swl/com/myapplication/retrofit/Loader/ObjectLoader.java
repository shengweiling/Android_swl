package test.swl.com.myapplication.retrofit.Loader;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/14  17:19
 */

public class ObjectLoader {
    public static <T>Observable<T> observe(Observable<T> observable){
        return observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io());
    }
}
