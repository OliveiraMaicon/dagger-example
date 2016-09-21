package com.example.maoliveira.testekaspersky.infrastructure.configuration.component;

import android.content.SharedPreferences;

import com.example.maoliveira.testekaspersky.infrastructure.configuration.module.ApplicationModule;
import com.example.maoliveira.testekaspersky.ui.fragment.main.MainFragmentComponent;
import com.example.maoliveira.testekaspersky.ui.fragment.main.MainFragmentModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maoliveira on 15/09/2016.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    MainFragmentComponent plus(MainFragmentModule module);

    SharedPreferences providePreferences();
}
