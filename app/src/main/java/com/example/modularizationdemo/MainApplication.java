package com.example.modularizationdemo;

import android.app.Application;

import com.example.componentbase.AppConfig;
import com.example.componentbase.BaseApp;

public class MainApplication extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化组件 Application
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        for (String moduleApp : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleApp(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleData(Application application) {

    }
}
