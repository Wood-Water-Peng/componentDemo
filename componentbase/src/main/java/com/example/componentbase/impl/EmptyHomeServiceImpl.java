package com.example.componentbase.impl;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.componentbase.service.IHomeService;

public class EmptyHomeServiceImpl implements IHomeService {
    @Override
    public Fragment getHomeTabFragment( Bundle bundle) {
        return null;
    }
}
