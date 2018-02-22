package com.material.circle.fold.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.dm.material.dashboard.candybar.activities.CandyBarSplashActivity;
import com.dm.material.dashboard.candybar.activities.configurations.SplashScreenConfiguration;
import com.material.circle.fold.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //switch from splash activity to main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}