package com.example.logincomponent.bean;

public class UserInner {
    private String name;
    private String psw;
    private String moreInfo;

    public UserInner() {
    }

    public UserInner(String name, String psw) {
        this.name = name;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public String getPsw() {
        return psw;
    }
}
