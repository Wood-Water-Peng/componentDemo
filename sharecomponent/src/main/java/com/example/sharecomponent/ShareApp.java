package com.example.sharecomponent;

import android.app.Application;

import com.example.componentbase.BaseApp;
import com.example.componentbase.ServiceFactory;

public class ShareApp extends BaseApp {
    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().registerShareService(new ShareServiceImpl());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
