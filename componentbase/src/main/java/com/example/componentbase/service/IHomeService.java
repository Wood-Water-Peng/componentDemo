package com.example.componentbase.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface IHomeService {
    public Fragment getHomeTabFragment( Bundle bundle);
}
