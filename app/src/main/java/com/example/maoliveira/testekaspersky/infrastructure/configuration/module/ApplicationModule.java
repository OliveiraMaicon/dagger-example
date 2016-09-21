package com.example.maoliveira.testekaspersky.infrastructure.configuration.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.maoliveira.testekaspersky.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maoliveira on 15/09/2016.
 */
@Module
public class ApplicationModule {

    private static final String PREF_KEY = "pk";

    private AndroidApplication application;

    public ApplicationModule(AndroidApplication application){
        this.application = application;
    }

    @Provides
    @Singleton
    public AndroidApplication provideAndroidApplication(){
        return application;
    }


    @Provides
    @Singleton
    public SharedPreferences providePreferences(){
        return this.application.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE);
    }
}
