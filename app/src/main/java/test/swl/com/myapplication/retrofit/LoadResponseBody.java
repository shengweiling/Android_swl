package test.swl.com.myapplication.retrofit;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/**
 * @desc   //添加进度展示
 * @auth ${user}
 * @time 2018/3/16  13:49
 */

public class LoadResponseBody extends ResponseBody {
    private ResponseBody mResponseBody;
    private DownLoadListener mLoadListener;
    private BufferedSource mBufferedSource;

    public LoadResponseBody(ResponseBody responseBody, DownLoadListener loadListener) {
        mResponseBody = responseBody;
        mLoadListener = loadListener;
    }

    @Override
    public MediaType contentType() {
        return mResponseBody.contentType();
    }

    @Override
    public long contentLength() {
        return mResponseBody.contentLength();
    }

    @Override
    public BufferedSource source() {
        if(mBufferedSource==null){
            mBufferedSource= Okio.buffer(source(mResponseBody.source()));
        }
        return mBufferedSource;
    }

    private Source source(BufferedSource source) {
        ForwardingSource forwardingSource = new ForwardingSource(source) {
            long totalBytes = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                totalBytes += bytesRead == -1 ? 0 : bytesRead;
                if (null != mLoadListener) {
                    if (bytesRead != -1) {
                        mLoadListener.onPregress((int) (totalBytes * 100 / contentLength()));
                    }
                }
                return bytesRead;
            }
        };
        return forwardingSource;
    }
}
