package com.example.componentimpl;

import android.app.Application;

import androidx.annotation.NonNull;

public class Config {
    @NonNull
    private Application application;

    private Config(@NonNull Builder builder) {
        this.application = builder.application;
    }

    @NonNull
    public static Builder with(@NonNull Application application) {
        return new Builder(application);
    }

    public static class Builder {

        private Application application;

        public Builder(@NonNull Application application) {
            Utils.checkNullPointer(application, "application");
            this.application = application;
        }

        @NonNull
        public Config build() {
            // 提前创建对象
            Config config = new Config(this);
            return config;
        }
    }

    @NonNull
    public Application getApplication() {
        return application;
    }
}
