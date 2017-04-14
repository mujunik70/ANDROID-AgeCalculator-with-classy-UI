package com.project.stickysoft.agecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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

    public void onClick_myAge(View view){
        ImageButton imageButton_myAge = (ImageButton) findViewById(R.id.my_age_btn);
        Intent intent = new Intent(this, MyAge2.class);
        startActivity(intent);
    }
    public void onClick_guardianAge(View view){
        ImageButton imageButton_guardianAge = (ImageButton) findViewById(R.id.guardian_age_btn);
        Intent intent = new Intent(this, GuardianAge2.class);
        startActivity(intent);
    }

}
