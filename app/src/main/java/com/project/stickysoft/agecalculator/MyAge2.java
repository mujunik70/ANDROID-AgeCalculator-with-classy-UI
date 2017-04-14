package com.project.stickysoft.agecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MyAge2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_age2);
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

        String address_ue = "You were born in";
        String now_ue = "You are";

        EditText entry1 = (EditText) findViewById(R.id.yob);
        //TextView textView = (TextView) findViewById(R.id.myAge_ans);
        int yob = Integer.parseInt(entry1.getText().toString());
        int myAge = (2017 - yob);

        String age = String.valueOf(myAge);
        String address = String.valueOf(address_ue);
        String now = String.valueOf(now_ue);
        String yob_e = String.valueOf(yob);

        Intent send = new Intent(this, AgeResult2.class);
        send.putExtra("My Address", address);
        send.putExtra("Age now", now);
        send.putExtra("YOB", yob_e);
        send.putExtra("My Age", age);

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
