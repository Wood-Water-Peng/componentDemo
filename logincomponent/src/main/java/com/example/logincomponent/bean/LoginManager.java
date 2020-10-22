package com.example.logincomponent.bean;

import android.app.Application;
import android.text.TextUtils;


import com.example.componentbase.login.ILoginCallback;
import com.example.componentbase.login.ILogoutCallback;
import com.example.componentbase.login.User;

import java.util.Random;

public class LoginManager {
    private static volatile LoginManager INSTANCE;
    User mUser;

    private LoginManager() {

    }

    public static LoginManager getInstance() {

        if (INSTANCE == null) {
            synchronized (LoginManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LoginManager();
                }
            }
        }
        return INSTANCE;
    }


    public void login(String userName, String psw,int style, ILoginCallback callback) {
        if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(psw)) {

            Random random = new Random();
            boolean flag = false;
            if (random.nextInt(100) % 2 == 0) {
                flag = true;
            }
            if (flag) {
                mUser = new User(userName, psw);
                if (callback != null) {
                    callback.onSuccess(mUser);
                }
            } else {
                if (callback != null) {
                    callback.onFailed(0, "登录失败");
                }
            }
        }
    }

    public void logout(String userName, ILogoutCallback callback) {
        if (mUser == null) {
            if (callback != null) {
                callback.onFailed(0, "已经登出");
            }
        } else if (TextUtils.isEmpty(userName)) {
            if (callback != null) {
                callback.onFailed(0, "无效用户名");
            }
        } else {
            if (userName.equals(mUser.getName())) {
                mUser = null;
                //登出成功
                if (callback != null) {
                    callback.onSuccess();
                }
            } else {
                if (callback != null) {
                    callback.onFailed(0, "无效用户名");
                }
            }
        }
    }
}
