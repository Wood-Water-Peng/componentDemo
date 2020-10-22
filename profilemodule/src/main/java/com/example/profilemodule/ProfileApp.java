package com.example.profilemodule;

import android.app.Application;

import com.alibaba.android.arouter.BuildConfig;
import com.example.annolib.ModuleAppAnno;
import com.example.componentbase.AppConfig;
import com.example.componentbase.BaseApp;
import com.example.componentbase.ModuleConfig;
import com.example.componentimpl.Component;
import com.example.componentimpl.Config;
import com.example.componentimpl.ModuleManager;

@ModuleAppAnno()
public class ProfileApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化组件化相关
        Component.init(
                BuildConfig.DEBUG, Config.with(this)
                        .build()
        );

        //装载组件
        ModuleManager.getInstance().register(ModuleConfig.ModuleLogin.NAME);
    }

}
