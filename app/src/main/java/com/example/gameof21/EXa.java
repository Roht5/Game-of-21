package com.example.gameof21;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;

public class EXa<Public> extends AppCompatDialog {
    @Override
    Public Dialog onCreateDialog(Bundle savedInstanceState) {
        super();
        AlertDialog.Builder builder=new AlertDialog.Builder(getOwnerActivity());
        LayoutInflater inflater=getOwnerActivity().getLayoutInflater();
        View view =inflater.inflate(R.layout.gameov,null);
        builder.setView(view)
                .setTitle("Gameover")
                .setNegativeButton("cancel", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }

    public EXa(Context context) {
        super(context);
    }
}
