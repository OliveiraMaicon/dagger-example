package com.example.maoliveira.testekaspersky.infrastructure.configuration.component.antivirus;

import android.content.SharedPreferences;

import com.example.maoliveira.testekaspersky.domain.entity.Antivirus;
import com.example.maoliveira.testekaspersky.infrastructure.configuration.component.ApplicationComponent;
import com.example.maoliveira.testekaspersky.infrastructure.configuration.module.antivirus.AntivirusModule;
import com.example.maoliveira.testekaspersky.infrastructure.annotation.ActivityScope;

import dagger.Component;

/**
 * Created by maoliveira on 15/09/2016.
 */

@ActivityScope
@Component(dependencies = {
            ApplicationComponent.class
        },modules ={
        AntivirusModule.class
} )
public interface AntivirusComponent {

    public void inject(Antivirus antivirus);

    Antivirus provideAntivirus();

    SharedPreferences provideSharedPreferences();
}
