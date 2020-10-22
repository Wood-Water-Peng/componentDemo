package com.example.logincomponent.bean.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.componentbase.login.ILoginCallback;
import com.example.componentbase.login.ILogoutCallback;
import com.example.componentbase.login.User;
import com.example.componentbase.service.IUserService;
import com.example.logincomponent.bean.LoginDialog;
import com.example.logincomponent.bean.LoginManager;
import com.example.logincomponent.bean.LoginTabFragment;
import com.example.logincomponent.bean.UserInner;

public class LoginService implements IUserService {
    @Override
    public User getUser() {
        return new User();
    }

    @Override
    public Fragment getLoginTabFragment(Bundle bundle) {
        // 创建 UserFragment 实例，并添加到 Activity 中
        Fragment userFragment = new LoginTabFragment();
        if (bundle != null) {
            userFragment.setArguments(bundle);
        }
        return userFragment;
    }

    @Override
    public void login(Activity activity,int style, ILoginCallback callback) {

        if (style == 0) {
            //跳转到LoginActivity
            ARouter.getInstance().build("/loginComponent/loginActivity").navigation();
        } else {
            //弹出登录dialog
            showLoginDialog(activity);
        }
    }

    private void showLoginDialog(Activity activity) {
        new LoginDialog(activity).show();
    }

    @Override
    public void logout(String userName, ILogoutCallback callback) {

    }


}
