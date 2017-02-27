package com.example.wilsona.correctmathgame;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
 /*   private int x;
    private String myText;
    private Handler myHandler;
    private TextView myScore;
    private TextView myDifficulty;
    private Button randomScoreButton = (Button) findViewById(R.id.btnRandomOne);
    private Button randomDifficultyButton = (Button) findViewById(R.id.btnRandomTwo);
    private Button randomTextButton = (Button) findViewById(R.id.btnRandomThree);
*/
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    }

/*

    private void generateNumber(){
        for(int i=0; i<50; i++){
            x = (int)(Math.random()*100+1);
            myText = String.valueOf(x);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            myHandler.post(new Runnable() {
                @Override
                public void run() {
                   myScore = (TextView) findViewById(R.id.txtScore);
                   myDifficulty = (TextView) findViewById(R.id.txtDifficulty);
                   String ogText=  myScore.getText().toString();
                   myScore.setText(ogText+ myText);
                   ogText= myDifficulty.getText().toString();
                   myDifficulty.setText(ogText+myText);
                }
            });
        }



    }

    public void doRandomOne(View view) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                generateNumber();
            }
        };
        new Thread(myRunnable).start();
    }
    */
}
