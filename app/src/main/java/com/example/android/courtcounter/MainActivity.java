package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayAScore();
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
     * This method displays the given quantity value on the screen.
     */
    private void displayAScore() {
        TextView aScoreDisplay = (TextView) findViewById(R.id.team_a_score);
        aScoreDisplay.setText("" + teamAScore);
    }
}
