package com.example.maoliveira.testekaspersky.ui.fragment.main;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.example.maoliveira.testekaspersky.AndroidApplication;
import com.example.maoliveira.testekaspersky.R;
import com.example.maoliveira.testekaspersky.ui.fragment.BaseFragment;
import com.example.maoliveira.testekaspersky.ui.presenter.main.MainPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainFragment extends BaseFragment implements MainView, View.OnClickListener {
    private static String TAG = MainFragment.class.getName();

 /*   @Inject
    MainPresenter presenter;*/

    @InjectView(R.id.resultView)
    TextView resultView;

    @InjectView(R.id.button)
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.inject(this, view);

        return view;
    }

    @Override
    protected void initailizeFragment(Bundle savedInstanceState) {

        AndroidApplication.get(this.getContext())
                .getApplicationComponent()
                .plus(new MainFragmentModule(this))
                .inject(this);

        button.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      /*  int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Log.i(TAG,"entrou");
        if (v.getId() == R.id.button) {
          /*  presenter.scan(v);*/
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "MainFragment is destroyed ...");
    }


    @Override
    public void showResult(final String result) {
        this.getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                resultView.setText(result);
            }
        });
    }

    @Override
    public void showError(final String error) {
        this.getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
            AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();

            alertDialog.setTitle("Alert");
            alertDialog.setMessage(error);
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });

            alertDialog.show();
            }
        });
    }
}