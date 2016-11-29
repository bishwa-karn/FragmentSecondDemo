package com.example.bishwa.karn.fragmentseconddemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

/**
 * Created by acer on 11/28/2016.
 */

public class FragmentDialogDemoSecond extends DialogFragment {

    LayoutInflater inflater;
    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.fragment_dialog_demo_second,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setView(view)
//                .setTitle("Alert Password Change")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(),"clicked ok button",Toast.LENGTH_LONG).show();

            }
        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();

            }
        });

        AlertDialog dialog = builder.create();


        return dialog;
    }
}
