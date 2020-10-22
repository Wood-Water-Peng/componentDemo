package com.example.componentimpl;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

/**
 * 组建的基本生命周期
 */
@UiThread
public interface IComponentLifecycle extends IHost{
    @UiThread
    void onCreate(@NonNull Application app);

    @UiThread
    void onDestroy();
}
