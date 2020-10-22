package com.example.componentbase.service;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.componentbase.login.ILoginCallback;
import com.example.componentbase.login.ILogoutCallback;
import com.example.componentbase.login.User;

public interface IUserService{
    public User getUser();

    public Fragment getLoginTabFragment(Bundle bundle);

    public void login(Activity activity,int style, ILoginCallback callback);
    public void logout(String userName, ILogoutCallback callback);
}
