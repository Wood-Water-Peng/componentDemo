package com.example.componentbase.impl;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.componentbase.login.ILoginCallback;
import com.example.componentbase.login.ILogoutCallback;
import com.example.componentbase.login.User;
import com.example.componentbase.service.IUserService;

public class EmptyUserServiceImpl implements IUserService {
    @Override
    public User getUser() {
        return null;
    }

    @Override
    public Fragment getLoginTabFragment( Bundle bundle) {
        return null;
    }

    @Override
    public void login(Activity activity, int style, ILoginCallback callback) {

    }


    @Override
    public void logout(String userName, ILogoutCallback callback) {

    }
}
