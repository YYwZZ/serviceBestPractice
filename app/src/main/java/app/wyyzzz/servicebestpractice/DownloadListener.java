package app.wyyzzz.servicebestpractice;

/**
 * Created by wuyuanyang on 2017/10/18.
 */

//回调接口，用于对下载过程中各种状态进行监听和回调

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
