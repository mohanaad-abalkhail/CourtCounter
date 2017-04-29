package com.android.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int foulsA = 0;
    int scoreB = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addGoalForTeamA(View view) {
        scoreA = scoreA + 1;
        displayGoalForTeamA(scoreA);
    }

    public void addFoulForTeamA(View view) {
        foulsA = foulsA + 1;
        displayFoulsForTeamA(foulsA);
    }


    public void addGoalForTeamB(View view) {
        scoreB = scoreB + 1;
        displayGoalForTeamB(scoreB);
    }

    public void addFoulForTeamB(View view) {
        foulsB = foulsB + 1;
        displayFoulsForTeamB(foulsB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
        displayGoalForTeamA(scoreA);
        displayGoalForTeamB(scoreB);
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulTeamB);
        scoreView.setText(String.valueOf(score));
    }

}
