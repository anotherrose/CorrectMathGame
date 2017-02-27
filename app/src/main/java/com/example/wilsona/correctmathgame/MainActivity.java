package com.example.wilsona.correctmathgame;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Handler myHandler;
    long startTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startTime = System.currentTimeMillis();

        myHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                    long seconds = ((System.currentTimeMillis() - startTime)) / 1000;
                    Log.i("info", "Seconds = " + seconds);
                myHandler.sendEmptyMessageDelayed(0, 1000);
            }
        };

        myHandler.sendEmptyMessageDelayed(0,0);

        Log.i("info", "does this run?");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button play = (Button) findViewById(R.id.btnPlay);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i =new Intent(this, GameActivity.class);
        startActivity(i);
    }
}
