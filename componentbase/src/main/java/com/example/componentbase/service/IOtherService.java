package com.example.componentbase.service;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

public interface IOtherService<T> {

    public Fragment getOtherTabFragment(Bundle bundle);
}
