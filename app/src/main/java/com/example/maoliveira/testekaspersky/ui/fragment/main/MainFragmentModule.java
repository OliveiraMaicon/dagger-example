package com.example.maoliveira.testekaspersky.ui.fragment.main;

import com.example.maoliveira.testekaspersky.infrastructure.annotation.ActivityScope;
import com.example.maoliveira.testekaspersky.interactor.main.MainInteractor;
import com.example.maoliveira.testekaspersky.interactor.main.MainInteractorImpl;
import com.example.maoliveira.testekaspersky.ui.presenter.main.MainPresenter;
import com.example.maoliveira.testekaspersky.ui.presenter.main.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maoliveira on 20/09/2016.
 */
@Module
public class MainFragmentModule {


    public final MainView view;

    public MainFragmentModule(MainView view){
        this.view = view;
    }

    @Provides
    @ActivityScope
    MainView provideMainView(){
        return this.view;
    }

    @Provides
    @ActivityScope
    MainInteractor provideMainInteractor(MainInteractorImpl mainInteractor){
        return mainInteractor;
    }

    @Provides
    @ActivityScope
    MainPresenter provideMainPresenter(MainPresenterImpl mainPresenter){
        return mainPresenter;
    }


}
