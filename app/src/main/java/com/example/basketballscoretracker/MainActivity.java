package com.example.basketballscoretracker;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView scoreView;
    int teamA=0,teamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void resetScore(View v){
        teamA=0;
        teamB=0;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }

    public void addThree(View v){
        teamA+=3;
        displayForTeamA(teamA);
    }
    public void addTwo(View v){
        teamA+=2;
        displayForTeamA(teamA);
    }
    public void free(View v){
        ++teamA;
        displayForTeamA(teamA);
    }

    public void displayForTeamA(int score){
        scoreView =  (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));

    }



    public void addThreeB(View v){
        teamB+=3;
        displayForTeamB(teamB);
    }
    public void addTwoB(View v){
        teamB+=2;
        displayForTeamB(teamB);
    }
    public void freeB(View v){
        ++teamB;
        displayForTeamB(teamB);
    }

    public void displayForTeamB(int score){
        scoreView =  (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));

    }


}