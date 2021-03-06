package com.example.maoliveira.testekaspersky.interactor.main;

import android.view.View;

import com.example.maoliveira.testekaspersky.domain.service.antivirus.AntivirusService;

import javax.inject.Inject;

/**
 * Created by maoliveira on 19/09/2016.
 */
public class MainInteractorImpl implements MainInteractor{

    AntivirusService antivirusService;

    @Inject
    public MainInteractorImpl(AntivirusService antivirusService){
        this.antivirusService = antivirusService;
    }

    @Override
    public void startScan(View view) {
        antivirusService.scan();
    }


}
