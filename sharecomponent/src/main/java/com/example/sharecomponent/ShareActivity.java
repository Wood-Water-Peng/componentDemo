package com.example.sharecomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.componentbase.ServiceFactory;

@Route(path = "/shareComponent/shareActivity")
public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    private void share() {
        if (ServiceFactory.getInstance().getAccountService().getUser() != null) {
            //分享成功
        }
    }
}
