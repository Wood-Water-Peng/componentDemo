package com.example.componentbase.login;

public class User {
    private String name;
    private String psw;

    public User() {
    }

    public User(String name, String psw) {
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
