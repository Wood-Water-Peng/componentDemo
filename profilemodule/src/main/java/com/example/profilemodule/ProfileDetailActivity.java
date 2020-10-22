package com.example.profilemodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.componentbase.ServiceFactory;
import com.example.componentbase.login.ILoginCallback;
import com.example.componentbase.login.User;

public class ProfileDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProfileApp profileApp = new ProfileApp();
        setContentView(R.layout.activity_profile_detail);
        findViewById(R.id.activity_profile_detail_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断是否登录
                User user = ServiceFactory.getInstance().getAccountService().getUser();
                if (user != null) {
                    //已经登录
                    showProfileDialog(user);
                } else {
                    //未登录
                    ServiceFactory.getInstance().getAccountService().login(ProfileDetailActivity.this, 0, new ILoginCallback() {
                        @Override
                        public void onSuccess(User user) {

                        }

                        @Override
                        public void onFailed(int errorCode, String msg) {

                        }
                    });
                }
            }
        });
    }

    private void showProfileDialog(User user) {
        Toast.makeText(this, "you name is:" + user.getName(), Toast.LENGTH_SHORT).show();
    }

}
