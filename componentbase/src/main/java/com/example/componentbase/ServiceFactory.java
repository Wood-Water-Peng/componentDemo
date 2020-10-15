package com.example.componentbase;

import com.example.componentbase.impl.EmptyHomeServiceImpl;
import com.example.componentbase.impl.EmptyShareServiceImpl;
import com.example.componentbase.impl.EmptyUserServiceImpl;
import com.example.componentbase.service.IHomeService;
import com.example.componentbase.service.IOtherService;
import com.example.componentbase.service.IShareService;
import com.example.componentbase.service.IUserService;

public class ServiceFactory {
    private IUserService accountService;
    private IHomeService homeService;
    private IShareService shareService;
    private IOtherService otherService;

    /**
     * 禁止外部创建 ServiceFactory 对象
     */
    private ServiceFactory() {
    }

    /**
     * 通过静态内部类方式实现 ServiceFactory 的单例
     */
    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    public void registerUserService(IUserService userService) {
        this.accountService = userService;
    }

    public void registerHomeService(IHomeService homeService) {
        this.homeService = homeService;
    }

    public void registerShareService(IShareService shareService) {
        this.shareService = shareService;
    }


    public void registerOtherService(IOtherService otherService) {
        this.otherService = otherService;
    }

    public IUserService getAccountService() {
        if (accountService == null) {
            return new EmptyUserServiceImpl();
        }
        return accountService;
    }

    public IHomeService getHomeService() {
        if (homeService == null) {
            return new EmptyHomeServiceImpl();
        }
        return homeService;
    }

    public IShareService getShareService() {
        if (shareService == null) {
            return new EmptyShareServiceImpl();
        }
        return shareService;
    }

    public IOtherService getOtherService() {
        return otherService;
    }
}
