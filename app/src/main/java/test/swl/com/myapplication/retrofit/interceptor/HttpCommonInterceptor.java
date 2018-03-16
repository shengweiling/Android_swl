package test.swl.com.myapplication.retrofit.interceptor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @desc
 * @auth ${user}
 * @time 2018/3/14  16:35
 */

public class HttpCommonInterceptor implements Interceptor {
    private Map<String,String> headerParams=new HashMap<>();
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request oldRequest = chain.request();
        Request.Builder builder = oldRequest.newBuilder();
        builder.method(oldRequest.method(),oldRequest.body());
        if(headerParams.size()>0){
            for(Map.Entry<String,String> params:headerParams.entrySet()){
                builder.addHeader(params.getKey(),params.getValue());
            }
        }
        Request newRequest = builder.build();
        return chain.proceed(newRequest);
    }
    public static class Builder{
        HttpCommonInterceptor mHttpCommonInterceptor;
        public Builder(){
            mHttpCommonInterceptor=new HttpCommonInterceptor();
        }
        public Builder addHeaderParams(String key,String value){
            mHttpCommonInterceptor.headerParams.put(key,value);
            return this;
        }
        public Builder  addHeaderParams(String key, int value){
            return addHeaderParams(key, String.valueOf(value));
        }
        public Builder  addHeaderParams(String key, float value){
            return addHeaderParams(key, String.valueOf(value));
        }
        public Builder  addHeaderParams(String key, long value){
            return addHeaderParams(key, String.valueOf(value));
        }
        public Builder  addHeaderParams(String key, double value){
            return addHeaderParams(key, String.valueOf(value));
        }

      public HttpCommonInterceptor build(){
          return mHttpCommonInterceptor;
      }
    }
}
