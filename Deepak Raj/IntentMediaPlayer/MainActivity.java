package com.example.mediaplayer;

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

        mp = MediaPlayer.create(getApplicationContext(), R.raw.song);
        mp.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mp.isPlaying()){
                    mp.stop();
                }
                Intent home = new Intent(getApplicationContext(),
                        HomeActivity.class);
                startActivity(home);
                finish();
            }
        }, 6000);
    }
}