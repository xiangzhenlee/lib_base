package com.yushan.lib_base.base;

/**
 * <p>类说明</p>
 *
 * @author yushan
 * @version V2.8.3
 * @name ApplicationDelegate
 */


public interface ApplicationDelegate {

    void onCreate();

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);

}
