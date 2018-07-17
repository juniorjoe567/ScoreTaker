package com.example.android.scoretaker;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    //Get reference to textviews


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score1 = 0;
    int score2 = 0;


    public void AddOne2(View v){
        score1 = score1 + 2;
        displayScoreOne(score1);

    }
    public void AddOne4(View v){
        score1 = score1 + 4;
        displayScoreOne(score1);
    }
    public void AddTwo2(View v){
        score2 = score2 + 2;
        displayScoreTwo(score2);
    }
    public void AddTwo4(View v){
        score2 = score2 + 4;
        displayScoreTwo(score2);
    }

    //functions responsible for displaying the scores
    public void displayScoreOne(int score){
        TextView x = (TextView)findViewById(R.id.player_one_score);
        x.setText(toString().valueOf(score));
    }

    public void displayScoreTwo(int score){
        TextView y = (TextView)findViewById(R.id.player_two_score);
        y.setText(toString().valueOf(score));


    }
    public void reset(View v){
        displayScoreOne(0);
        displayScoreTwo(0);
    }
}
