package com.example.maoliveira.testekaspersky.infrastructure.configuration.module.antivirus;

import com.example.maoliveira.testekaspersky.domain.entity.Antivirus;
import com.example.maoliveira.testekaspersky.infrastructure.annotation.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maoliveira on 15/09/2016.
 */
@Module
public class AntivirusModule {

    @Provides
    @ActivityScope
    public Antivirus provideAntivirus(){
        return new Antivirus();
    }


}
