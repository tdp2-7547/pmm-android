package com.uberpets.tpd2_1c_2019_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hola!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button driverButton = findViewById(R.id.driverButton);
    }

    public void goToDriverHome(View view){
        Intent intent = new Intent(this, DriverHome.class);
        startActivity(intent);
    }

    public void goToUserHome(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

}
