package com.project.stickysoft.agecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AgeResult2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_result2);
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

        Intent intent = getIntent();
        Bundle recieve = intent.getExtras();

        String myAddress = recieve.getString("My Address");
        String ageNow = recieve.getString("Age now");
        String yob = recieve.getString("YOB");
        String myAge = recieve.getString("My Age");

        TextView address = (TextView) findViewById(R.id.person_calc_address);
        address.setText(myAddress);
        TextView tv_yob = (TextView) findViewById(R.id.result_yob);
        tv_yob.setText(yob);
        TextView now = (TextView) findViewById(R.id.person_calc);
        now.setText(ageNow);
        TextView age = (TextView) findViewById(R.id.myAge_ans);
        age.setText(myAge);
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
