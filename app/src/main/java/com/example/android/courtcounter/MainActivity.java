package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayAScore();
        displayBScore();
    }

    public void increaseAScore3(View view) {
        teamAScore += 3;
        displayAScore();
    }

    public void increaseAScore2(View view) {
        teamAScore += 2;
        displayAScore();
    }

    public void increaseAScore1(View view) {
        teamAScore += 1;
        displayAScore();
    }

    /**
     * This method displays Team A score value on the screen.
     */
    private void displayAScore() {
        TextView aScoreDisplay = (TextView) findViewById(R.id.team_a_score);
        aScoreDisplay.setText("" + teamAScore);
    }


    public void increaseBScore3(View view) {
        teamBScore += 3;
        displayBScore();
    }

    public void increaseBScore2(View view) {
        teamBScore += 2;
        displayBScore();
    }

    public void increaseBScore1(View view) {
        teamBScore += 1;
        displayBScore();
    }

    /**
     * This method displays Team B score value on the screen.
     */
    private void displayBScore() {
        TextView bScoreDisplay = (TextView) findViewById(R.id.team_b_score);
        bScoreDisplay.setText("" + teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayAScore();
        displayBScore();
    }
}
