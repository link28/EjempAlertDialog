package com.example.karel.ejempalertdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Date;

public class MyAlertDialogFragment extends DialogFragment {
    public static MyAlertDialogFragment newInstance(int title) {
        MyAlertDialogFragment frag = new MyAlertDialogFragment();

        Bundle args = new Bundle();
        args.putInt("title", title);
        args.putString("message", "\n:/\n:D\n:)\n:p");
        args.putInt("icon", R.mipmap.ic_happy_plus);

        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");
        int icon = getArguments().getInt("icon");
        String message = getArguments().getString("message");
        return new android.support.v7.app.AlertDialog.Builder(getActivity())
                .setIcon(icon)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Positivo",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int whichButton) {
                                ((MainActivity) getActivity())
                                        .doPositiveClick(new Date());
                            }
                        })
                .setNegativeButton("Negativo",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int whichButton) {
                                ((MainActivity) getActivity())
                                        .doNegativeClick(new Date());
                            }
                        })
                .setNeutralButton("Neutral",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int whichButton) {
                    ((MainActivity) getActivity())
                            .doNeutralClick(new Date());
                            }
                        })
                .create();
    } }



