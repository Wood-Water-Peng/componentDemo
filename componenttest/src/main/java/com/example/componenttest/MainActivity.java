package com.example.componenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void homeTabClicked(View view) {
        ARouter.getInstance().build("/homeComponent/homeActivity").navigation();
    }

    public void loginTabClicked(View view) {
        ARouter.getInstance().build("/loginComponent/loginActivity").navigation();
    }

    public void otherTabClicked(View view) {
        ARouter.getInstance().build("/otherComponent/otherActivity").navigation();
    }
}
