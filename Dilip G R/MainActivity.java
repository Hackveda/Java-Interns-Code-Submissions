package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.kgfbgm);
        mp.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // your code

                if(mp.isPlaying()) mp.stop();
                Intent myplayer = new Intent(getApplicationContext(),
                        com.example.mediaplayer.myplayer.class);
                startActivity(myplayer);
                finish();
            }
        }, 5000);

    }
}