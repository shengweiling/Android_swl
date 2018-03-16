package test.swl.com.myapplication.retrofit;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/16  13:48
 */

public interface DownLoadListener {
    void startLoad();
    void onPregress(int progress);
    void loadFinish();
    void loadError(String errorInfo);
}
