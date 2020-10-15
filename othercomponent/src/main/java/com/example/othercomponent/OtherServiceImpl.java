package com.example.othercomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.componentbase.service.IHomeService;
import com.example.componentbase.service.IOtherService;

public class OtherServiceImpl implements IOtherService {
    @Override
    public Fragment getOtherTabFragment(Bundle bundle) {
        // 创建 UserFragment 实例，并添加到 Activity 中
        Fragment userFragment = new OtherTabFragment();
        if (bundle != null) {
            userFragment.setArguments(bundle);
        }
        return userFragment;
    }
}
