package com.example.componentbase;

public class AppConfig {
    private static final String LoginApp = "com.example.logincomponent.bean.LoginApp";
    private static final String HomeApp = "com.example.homecomponent.HomeApp";
    private static final String ShareApp = "com.example.sharecomponent.ShareApp";
    private static final String OtherApp = "com.example.othercomponent.OtherApp";

    public static String[] moduleApps = {
            LoginApp,
            ShareApp,
            HomeApp,
            OtherApp,
    };
}
