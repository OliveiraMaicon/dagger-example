package com.example.maoliveira.testekaspersky.ui.fragment.main;

import com.example.maoliveira.testekaspersky.infrastructure.annotation.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by maoliveira on 20/09/2016.
 */

@ActivityScope
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentComponent {

    void inject(MainFragment mainFragment);
}
