package com.atul.rakholiya.adsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.atul.rakholiya.android_lib_ads.AdUtils;
import com.atul.rakholiya.android_lib_ads.AppOpenAdManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AdUtils.setID(this, "your-ad-id");
        AdUtils.setSingle(this, true);
        // if you want to show ad every time when user come in app set the value false

        new Handler().postDelayed(() -> {
            AdUtils.isOpen = true;
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            new AppOpenAdManager(SplashActivity.this, intent);
        }, 500);
    }
}