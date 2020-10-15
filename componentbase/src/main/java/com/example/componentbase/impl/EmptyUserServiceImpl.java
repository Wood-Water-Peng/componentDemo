package com.example.componentbase.impl;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.componentbase.service.IUserService;

public class EmptyUserServiceImpl implements IUserService {
    @Override
    public Object getUser() {
        return null;
    }

    @Override
    public Fragment getLoginTabFragment( Bundle bundle) {
        return null;
    }
}
