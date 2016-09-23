package com.example.maoliveira.testekaspersky.domain.service.antivirus;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by maoliveira on 16/09/2016.
 */
public class AntivirusServiceImpl implements AntivirusService {
    private static String TAG = AntivirusServiceImpl.class.getName();

   /* @Inject
    public AntivirusServiceImpl(){

    }
*/
    @Override
    public String scan() {

        Log.i(TAG, "Scan executado com sucesso.");

        return "OK";
    }
}
