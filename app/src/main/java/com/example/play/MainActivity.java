package com.example.play;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button Play;
    Button Pause;
    MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer playMusic = MediaPlayer.create(this, R.raw.astronaut);
        Button Play= (Button) this.findViewById(R.id.AstronautInTheOcean);
        Button Pause= (Button) this.findViewById(R.id.pause1);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic.start();
            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic.pause();
            }
        });

    }
}