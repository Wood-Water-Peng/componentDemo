package com.example.modularizationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.componentbase.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    private int curTab = 0;

    public static final String TAG_HOME_FRAGMENT = "home";
    public static final String TAG_ACCOUNT_FRAGMENT = "account";
    public static final String TAG_SHARE_FRAGMENT = "share";
    public static final String TAG_OTHER_FRAGMENT = "other";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTab();
    }

    private void initTab() {
        showOtherFragment();
    }

    public void jump2Login(View view) {
        ARouter.getInstance().build("/logincomponent/login").navigation();
    }

    public void jump2Share(View view) {
        ARouter.getInstance().build("/sharecomponent/share").navigation();
    }

    public void homeTabClicked(View view) {
        showHomeFragment();
        curTab = 0;

    }

    public void loginTabClicked(View view) {
        showUserFragment();
        curTab = 1;
    }

    public void shareTabClicked(View view) {
        showShareFragment();
        curTab = 2;
    }

    private void showHomeFragment() {
        Fragment home = getSupportFragmentManager().findFragmentByTag(TAG_HOME_FRAGMENT);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (home == null) {
            home = ServiceFactory.getInstance().getHomeService().getHomeTabFragment(null);
            transaction.replace(R.id.content, home, TAG_HOME_FRAGMENT);
        }
        transaction.commit();
    }

    private void showUserFragment() {
        Fragment user = getSupportFragmentManager().findFragmentByTag(TAG_ACCOUNT_FRAGMENT);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (user == null) {
            user = ServiceFactory.getInstance().getAccountService().getLoginTabFragment(null);
            transaction.replace(R.id.content, user, TAG_ACCOUNT_FRAGMENT);
        }
        transaction.commit();
    }

    private void showShareFragment() {
        Fragment share = getSupportFragmentManager().findFragmentByTag(TAG_SHARE_FRAGMENT);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (share == null) {
            share = ServiceFactory.getInstance().getShareService().getShareFragment(null);
            transaction.replace(R.id.content, share, TAG_SHARE_FRAGMENT);
        }
        transaction.commit();
    }

    private void showOtherFragment() {
        Fragment other = getSupportFragmentManager().findFragmentByTag(TAG_OTHER_FRAGMENT);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (other == null) {
            other = ServiceFactory.getInstance().getOtherService().getOtherTabFragment(null);
            transaction.replace(R.id.content, other, TAG_SHARE_FRAGMENT);
        }
        transaction.commit();
    }
}
