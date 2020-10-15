package com.example.sharecomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.componentbase.service.IShareService;

public class ShareServiceImpl implements IShareService {
    @Override
    public Fragment getShareFragment(Bundle bundle) {
        return new ShareFragment();
    }
}
