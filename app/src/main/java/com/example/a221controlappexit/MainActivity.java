package com.example.a221controlappexit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

//============================== When i want to exit with a button =========================
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Confirm exit !")
                        .setMessage("Do you really Want to exit ?")
                        .setIcon(R.drawable.warning_icon)
                        .setNegativeButton("No Thanks!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveButton("Yes, Exit!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                finishAndRemoveTask();
                            }
                        })
                        .show();
            }
        });
        //================================= Button exit with warning finished======================


    }

    //======================================================================
//   this alert dialog will display a warning when user will press the system back button
//   this alert dialog will display a warning when user will press the system back button
//   this alert dialog will display a warning when user will press the system back button
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    new AlertDialog.Builder(MainActivity.this)
            .setTitle("Confirm exit !")
            .setMessage("Do you really Want to exit ?")
            .setIcon(R.drawable.warning_icon)
            .setNegativeButton("No Thanks!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            })

            .setPositiveButton("Yes, Exit!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    finishAndRemoveTask();
                }
            })
            .show();
    }
    // ======================Alert dialog ends here===============================
    // ======================Alert dialog ends here===============================
    // ======================Alert dialog ends here===============================


}