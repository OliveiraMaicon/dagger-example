package com.example.maoliveira.testekaspersky.ui.presenter.main;

import android.view.View;

import com.example.maoliveira.testekaspersky.ui.activity.OnInfoCompletedListner;

/**
 * Created by maoliveira on 19/09/2016.
 */
public interface MainPresenter  extends OnInfoCompletedListner{
    void scan(View view);
}
