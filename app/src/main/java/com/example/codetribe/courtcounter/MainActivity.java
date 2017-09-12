package com.example.codetribe.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// global declaration for score team A and Team B
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    //add 3 on team a
    public void addThreeForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
    }
    //add 2 on team a
    public void addTwoForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    //add 1 on team a
    public void addOneForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    //add 3 on team B
    public void addThreeForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }
    //add 2 on team B
    public void addTwoForTeamB(View v)
    {
        scoreTeamB = scoreTeamA + 2;
        displayForTeamB(scoreTeamB);
    }
    //add 1 on team B
    public void addOneForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //resets score for both teams
    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
//display the given score for team a
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //display the given score for team b
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
