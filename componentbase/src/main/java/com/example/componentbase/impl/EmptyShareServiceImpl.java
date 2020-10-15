package com.example.componentbase.impl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.componentbase.service.IShareService;

public class EmptyShareServiceImpl implements IShareService {
    @Override
    public Fragment getShareFragment(Bundle bundle) {
        return null;
    }
}
