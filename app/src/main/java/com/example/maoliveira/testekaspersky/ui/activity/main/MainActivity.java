package com.example.maoliveira.testekaspersky.ui.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.maoliveira.testekaspersky.R;
import com.example.maoliveira.testekaspersky.ui.activity.BaseActivity;

public class MainActivity  extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        /*if(view.getId() == R.id.mainView){
            mainPresenter.scan(view);
        }*/

    }
}

