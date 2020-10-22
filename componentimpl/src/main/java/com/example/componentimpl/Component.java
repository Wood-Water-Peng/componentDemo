package com.example.componentimpl;

import android.app.Application;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

public class Component {

    private static boolean hasInit;


    /**
     * 是否是 debug 状态
     */
    private static boolean isDebug = false;

    /**
     * 配置对象
     */
    private static Config mConfig = null;

    /**
     * 初始化
     *
     * @see Config 初始化的配置对象
     */
    @UiThread
    public static void init(boolean isDebug, @NonNull Config config) {
        // 做必要的检查
        if (hasInit) {
            throw new RuntimeException("you have init Component already!");
        }
        Utils.checkMainThread();
        Component.isDebug = isDebug;
        mConfig = config;
        hasInit = true;
    }

    @NonNull
    @AnyThread
    public static Config getConfig() {
        checkInit();
        return mConfig;
    }

    private static void checkInit() {
        if (mConfig == null) {
            throw new RuntimeException("you must init Component first!");
        }
    }

    @NonNull
    @AnyThread
    public static Application getApplication() {
        checkInit();
        return mConfig.getApplication();
    }


    public static boolean isDebug() {
        return isDebug;
    }
}
