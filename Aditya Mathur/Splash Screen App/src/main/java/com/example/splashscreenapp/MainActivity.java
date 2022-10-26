package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Reference to music files
        mp = MediaPlayer.create(getApplicationContext(),R.raw.music);
        mp.start();

        //Post delay

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Code here
                if(mp.isPlaying()){
                    mp.stop();
                }
                //Change from current Activity to new Activity
                Intent home = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(home);
                finish();

            }
        },50000);

    }
}