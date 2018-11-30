package com.roque.projectoxford.face.samples.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.roque.projectoxford.face.samples.R;

public class SplashActivity extends AppCompatActivity {
    public static final int TIME_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    nextActivity();
                } catch (Exception e) {
                    Toast.makeText(SplashActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            }
        }, TIME_SPLASH);
    }

    private void nextActivity() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
