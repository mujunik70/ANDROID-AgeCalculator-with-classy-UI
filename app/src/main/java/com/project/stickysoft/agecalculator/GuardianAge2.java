package com.project.stickysoft.agecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class GuardianAge2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardian_age2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick_myAgeCalc(View view){


        EditText entry1 = (EditText) findViewById(R.id.yob);
        int yob = Integer.parseInt(entry1.getText().toString());
        int myAge = (2017 - yob);
        EditText entry2 = (EditText) findViewById(R.id.g_age);
        int gadAgeAtBirth = Integer.parseInt(entry2.getText().toString());
        int gadAge = myAge + gadAgeAtBirth;

        String guardianAge = String.valueOf(gadAge);
        String guardianAgeAtBirth = String.valueOf(gadAgeAtBirth);
        String yob_e = String.valueOf(yob);

        Intent send = new Intent(this, ParentResult2.class);

        send.putExtra("YOB", yob_e);
        send.putExtra("Guardian Age", guardianAge);
        send.putExtra("Guardian Age At Birth", guardianAgeAtBirth);

        startActivity(send);


    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickMe(View view) {
        Intent intent = new Intent(this, MyAge2.class);
        startActivity(intent);
    }
    public void onClickParent(View view) {
        Intent intent = new Intent(this, GuardianAge2.class);
        startActivity(intent);
    }

}
