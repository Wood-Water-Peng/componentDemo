package com.example.componentbase.service;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface IUserService<T> {
    public T getUser();

    public Fragment getLoginTabFragment(Bundle bundle);
}
