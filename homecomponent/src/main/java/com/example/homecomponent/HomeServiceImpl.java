package com.example.homecomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.componentbase.service.IHomeService;

public class HomeServiceImpl implements IHomeService {
    @Override
    public Fragment getHomeTabFragment(Bundle bundle) {
        // 创建 UserFragment 实例，并添加到 Activity 中
        Fragment userFragment = new HomeTabFragment();
        if (bundle != null) {
            userFragment.setArguments(bundle);
        }
        return userFragment;
    }
}
