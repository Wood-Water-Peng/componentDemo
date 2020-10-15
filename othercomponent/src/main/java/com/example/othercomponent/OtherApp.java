package com.example.othercomponent;

import android.app.Application;

import com.example.componentbase.BaseApp;
import com.example.componentbase.ServiceFactory;

public class OtherApp extends BaseApp {

    @Override
    public void initModuleApp(Application application) {
        // 将 AccountService 类的实例注册到 ServiceFactory
        ServiceFactory.getInstance().registerOtherService(new OtherServiceImpl());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
