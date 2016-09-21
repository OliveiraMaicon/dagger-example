package com.example.maoliveira.testekaspersky.ui.presenter.main;

import android.view.View;

import com.example.maoliveira.testekaspersky.interactor.main.MainInteractor;
import com.example.maoliveira.testekaspersky.ui.fragment.main.MainView;

import javax.inject.Inject;

/**
 * Created by maoliveira on 19/09/2016.
 */
public class MainPresenterImpl implements MainPresenter {

    MainView mainView;

    MainInteractor mainInteractor;

    @Inject
    public MainPresenterImpl (MainView mainView,MainInteractor mainInteractor){
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    @Override
    public void scan(View view) {
        mainInteractor.startScan(view);
    }

    @Override
    public void onSuccess(String data) {

    }

    @Override
    public void onFailure(String errorMessage) {

    }
}
