package com.example.logincomponent.bean.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.componentbase.service.IUserService;
import com.example.logincomponent.bean.LoginTabFragment;
import com.example.logincomponent.bean.User;

public class LoginService implements IUserService<User> {
    @Override
    public User getUser() {
        return new User("张三");
    }

    @Override
    public Fragment getLoginTabFragment(Bundle bundle) {
        // 创建 UserFragment 实例，并添加到 Activity 中
        Fragment userFragment = new LoginTabFragment();
        if(bundle!=null){
            userFragment.setArguments(bundle);
        }
        return userFragment;
    }


}
