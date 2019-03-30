package com.production.ksm.medicalinternships;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity {

    int splashWaitingTime = 800;// 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                finish();
                startActivity(intent);
                overridePendingTransition(R.anim.splash_fade_in, R.anim.splash_fade_out);

            }
        }, splashWaitingTime);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                //Do nothing
            }
        }, splashWaitingTime);

    }

    @Override
    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }
}