package com.example.logincomponent.bean;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.example.logincomponent.R;

public class LoginDialog extends AlertDialog {
    Button btn;

    public LoginDialog(@NonNull Context context) {
        this(context, 0);
    }

    public LoginDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        setContentView(R.layout.dialog_login);
        initView();
    }

    private void initView() {
        btn = findViewById(R.id.btn);
    }

    public interface OnLoginListener {
        void onLoginClicked(Button btn);
    }

    OnLoginListener listener;

    public void setListener(OnLoginListener listener) {
        this.listener = listener;
    }
}
