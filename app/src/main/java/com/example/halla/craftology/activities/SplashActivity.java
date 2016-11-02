package com.example.halla.craftology.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.halla.craftology.R;
import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

public class SplashActivity extends AppCompatActivity {
    int progress = 0;
    android.os.Handler customHandler;
    CircularFillableLoaders circularFillableLoaders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         circularFillableLoaders = (CircularFillableLoaders)findViewById(R.id.circularFillableLoaders);

        customHandler = new android.os.Handler();
        customHandler.postDelayed(updateTimerThread, 500);
    }
    private Runnable updateTimerThread = new Runnable()
    {
        public void run()
        {
            //write here whaterver you want to repeat
            circularFillableLoaders.setProgress(progress);
            progress += 10;
            customHandler.postDelayed(this, 250);
            if(progress == 150){
                startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                finish();
            }
        }
    };
}
