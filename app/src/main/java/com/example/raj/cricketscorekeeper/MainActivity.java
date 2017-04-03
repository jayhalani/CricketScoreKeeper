package com.example.raj.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int wicketTeamA = 0;
    int scoreTeamB = 0;
    int wicketTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Adding Six Runs to Score of Team A.
    public void addSixForTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA, wicketTeamA);
    }

    // Adding Four Runs to Score of Team A.
    public void addFourForTeamA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA, wicketTeamA);
    }

    // Adding One Run to Score of Team A.
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, wicketTeamA);
    }

    // Adding One Run for No-Ball to Score of Team A.
    public void addNoBallForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, wicketTeamA);
    }

    // Adding the value of Wicket taken of Team A.
    public void wicketForTeamA(View view) {
        wicketTeamA = wicketTeamA + 1;
        displayForTeamA(scoreTeamA, wicketTeamA);
    }

    // Displaying the Score of Team A.
    public void displayForTeamA(int score, int wicket) {
        TextView scoreViewA = (TextView) findViewById(R.id.teamascore);
        scoreViewA.setText(String.valueOf(score) + "/" + String.valueOf(wicket));
    }

    // Adding Six Runs to Score of Team B.
    public void addSixForTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB, wicketTeamB);
    }

    // Adding Four Runs to Score of Team B.
    public void addFourForTeamB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB, wicketTeamB);
    }

    // Adding One Run to Score of Team B.
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, wicketTeamB);
    }

    // Adding One Run for No-Ball to Score of Team B.
    public void addNoBallForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, wicketTeamB);
    }

    // Adding the value of Wicket taken of Team B.
    public void wicketForTeamB(View view) {
        wicketTeamB = wicketTeamB + 1;
        displayForTeamB(scoreTeamB, wicketTeamB);
    }

    // Displaying the Score of Team B.
    public void displayForTeamB(int score, int wicket) {
        TextView scoreViewB = (TextView) findViewById(R.id.teambscore);
        scoreViewB.setText(String.valueOf(score) + "/" + String.valueOf(wicket));
    }

    // Resetting the Score and Wickets to 0, of Both the Teams.
    public void resetButton(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        displayForTeamA(scoreTeamA,wicketTeamA);
        displayForTeamB(scoreTeamB,wicketTeamB);
    }

}
