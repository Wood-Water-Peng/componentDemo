package com.example.logincomponent.bean;

import android.app.Application;

import com.example.componentbase.BaseApp;
import com.example.componentbase.ServiceFactory;
import com.example.logincomponent.bean.service.LoginService;

import java.security.PublicKey;

public class LoginApp extends BaseApp {

    public static Application applicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
    }

    @Override
    public void initModuleApp(Application application) {
        // 将 AccountService 类的实例注册到 ServiceFactory
        ServiceFactory.getInstance().registerUserService(new LoginService());
    }

    @Override
    public void initModuleData(Application application) {
        applicationContext=application;
    }
}
