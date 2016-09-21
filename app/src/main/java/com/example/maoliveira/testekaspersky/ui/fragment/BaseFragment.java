package com.example.maoliveira.testekaspersky.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment {
    String TAG = BaseFragment.class.getName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initailizeFragment(savedInstanceState);
    }

    abstract protected void initailizeFragment(Bundle savedInstanceState);
}
