package com.example.maoliveira.testekaspersky;

import android.app.Application;
import android.content.Context;

import com.example.maoliveira.testekaspersky.infrastructure.configuration.component.ApplicationComponent;
import com.example.maoliveira.testekaspersky.infrastructure.configuration.component.DaggerApplicationComponent;
import com.example.maoliveira.testekaspersky.infrastructure.configuration.module.ApplicationModule;

public class AndroidApplication extends Application {
    private static final String TAG = AndroidApplication.class.getSimpleName();

    private static ApplicationComponent mApplicationComponent;
    private static AndroidApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static AndroidApplication get(Context context){
        return (AndroidApplication) context.getApplicationContext();
    }

    public ApplicationComponent getApplicationComponent(){
        return  mApplicationComponent;
    }
}