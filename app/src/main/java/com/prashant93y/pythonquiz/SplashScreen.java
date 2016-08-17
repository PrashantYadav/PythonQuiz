package com.prashant93y.pythonquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

/**
 * Created by Prashant Yadav on 2/27/2016.
 */

public class SplashScreen extends Activity{
    private final int SPLASH_DISPLAY_TIME = 10000;
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.splash_screen);
        Log.e("splash", "running");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_DISPLAY_TIME);
    }
}
