package com.example.homecomponent;

import android.app.Application;

import com.example.componentbase.BaseApp;
import com.example.componentbase.ServiceFactory;

public class HomeApp extends BaseApp {

    @Override
    public void initModuleApp(Application application) {
        // 将 AccountService 类的实例注册到 ServiceFactory
        ServiceFactory.getInstance().registerHomeService(new HomeServiceImpl());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
