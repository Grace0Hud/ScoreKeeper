package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class scoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen2);

        ArrayList<Player> rankedPlayers = getIntent().getParcelableArrayListExtra("rankedPlayers");
        TextView scoresOutput = findViewById(R.id.scoreOutputTV);
        String output = "";

        for(int i = 0; i < rankedPlayers.size(); i++)
        {
           output += (i+1) + ". " + rankedPlayers.get(i).getPlayerName() + ": " + rankedPlayers.get(i).getScore() + "\n";
        }//end for loop cycling through array

        scoresOutput.setText(output);
    }

    public void onClickNewGameScoreScreen(View view)
    {
        Intent intent = new Intent(this, NewGameScreen.class);
        startActivity(intent);
    }
}