package com.yushan.lib_base.base;

/**
 * <p>数据回调接口</p>
 *
 * @author yushan
 * @version V1.2.0
 * @name InfoCallback
 */
public interface InfoCallback<T> {

    void onSuccess(T info);

    void onError(int code, String message);

}
