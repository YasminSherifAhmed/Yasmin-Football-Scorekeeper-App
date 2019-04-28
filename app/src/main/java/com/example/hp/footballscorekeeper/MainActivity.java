package com.example.hp.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the football score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    //Tracks the number of Goals for Team A
    int goalTeamA = 0;

    //Tracks the number of Fouls for Team A
    int foulTeamA = 0;

    //Tracks the number of Goals for Team B
    int goalTeamB = 0;

    //Tracks the number of Fouls for Team B
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * increases the number of Goals for Team A by 1 point
     */
    public void addGoalForTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalOfTeamA(goalTeamA);
    }

    /**
     * Displays the given number of Goals for Team A
     */
    public void displayGoalOfTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * increases the number of Fouls for Team A by 1 point
     */
    public void addFoulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulOfTeamA(foulTeamA);
    }

    /**
     * Displays the given number of Fouls for Team A.
     */
    public void displayFoulOfTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * increases the number of Goals of Team B by 1 point
     */
    public void addGoalForTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalOfTeamB(goalTeamB);
    }

    /**
     * Displays the given number of Goals for Team B
     */
    public void displayGoalOfTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * increases the number of Fouls for Team B by 1 point
     */
    public void addFoulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulOfTeamB(foulTeamB);
    }

    /**
     * Displays the given number of Fouls for Team B
     */
    public void displayFoulOfTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        goalTeamA = 0;
        foulTeamA = 0;
        goalTeamB = 0;
        foulTeamB = 0;
        displayGoalOfTeamA(goalTeamA);
        displayFoulOfTeamA(foulTeamA);
        displayGoalOfTeamB(goalTeamB);
        displayFoulOfTeamB(foulTeamB);
    }

}
