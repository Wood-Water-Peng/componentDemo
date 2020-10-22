package com.example.componentbase.login;


public interface ILoginCallback {
    void onSuccess(User user);
    void onFailed(int errorCode, String msg);
}
