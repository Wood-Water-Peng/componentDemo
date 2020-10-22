package com.example.componentbase.login;

public interface ILogoutCallback {
    void onSuccess();
    void onFailed(int errorCode, String msg);
}
