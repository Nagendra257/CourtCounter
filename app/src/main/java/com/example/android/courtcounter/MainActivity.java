package com.example.android.courtcounter;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView teamA = findViewById(R.id.team_a_score);
        TextView teamB = findViewById(R.id.team_b_score);


    }
    public void textColorChange(int scoreTeamA,int scoreTeamB){
        TextView teamA = findViewById(R.id.team_a_score);
        TextView teamB = findViewById(R.id.team_b_score);
        if(scoreTeamB>scoreTeamA){
            teamB.setTextColor(Color.parseColor("#76FF03"));
            teamA.setTextColor(Color.parseColor("#FF5722"));
        }
        else if(scoreTeamB<scoreTeamA){
            teamA.setTextColor(Color.parseColor("#76FF03"));
            teamB.setTextColor(Color.parseColor("#FF5722"));
        }
        else if(scoreTeamA==scoreTeamB&&scoreTeamA!=0||scoreTeamB!=0){
            teamA.setTextColor(Color.parseColor("#4A148C"));
            teamB.setTextColor(Color.parseColor("#4A148C"));
        }
        else{
            teamA.setTextColor(Color.parseColor("#000000"));
            teamB.setTextColor(Color.parseColor("#000000"));
        }
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixPointsForTeamA(View view){

         scoreTeamA +=6;
         textColorChange(scoreTeamA,scoreTeamB);
         displayForTeamA(scoreTeamA);
    }
    public void addThreePointsForTeamA(View view){

        scoreTeamA +=3;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsForTeamA(View view){

        scoreTeamA +=2;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointsForTeamA(View view){

        scoreTeamA +=1;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addSixPointsForTeamB(View view){

        scoreTeamB +=6;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    public void addThreePointsForTeamB(View view){

        scoreTeamB +=3;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    public void addOnePointsForTeamB(View view){

        scoreTeamB +=1;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsForTeamB(View view){

        scoreTeamB +=2;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    public void onReset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        textColorChange(scoreTeamA,scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
