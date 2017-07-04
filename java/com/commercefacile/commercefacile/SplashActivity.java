package com.commercefacile.commercefacile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //Option1: start main activity straight away. The best way
        // Start main activity
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        // close splash activity
        finish();
     
        /*
        //Option 2 : The bad way, start main activity with delay while showing brand. This is a waste of user time !
        //We can define layout and then set content for the SplashActivity
        //setContentView(R.layout.splash);
        // Start main activity
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    // Start main activity
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    // close splash activity
                    finish();
                }
            }
        };
        timerThread.start();
        */

    }



}
