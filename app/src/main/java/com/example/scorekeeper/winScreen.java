package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class winScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);

        ArrayList<Player> rankedPlayers = new ArrayList<>();
        String winner = "";
        /*
        if(getIntent().getStringExtra("winner") != "")
        {
             winner = getIntent().getStringExtra("winner");
             rankedPlayers = getIntent().getParcelableArrayListExtra("playersRanked");
        }

         */
        rankedPlayers = getIntent().getParcelableArrayListExtra("players");
       // Player winningPlayer = getIntent().getParcelableExtra("winner");
        winner = rankedPlayers.get(0).getPlayerName();
        //displaying the name of the winning player

        TextView winnerDisplay = findViewById(R.id.winnerDisplay);
        winnerDisplay.setText(winner + " Wins");
    }

    public void onNewGameClick(View view)
    {
        Intent intent = new Intent(this, NewGameScreen.class);
        startActivity(intent);
    }//end new game on click
    public void onClickViewScore(View view)
    {
        Intent intent = new Intent(this, scoreScreen.class);
        startActivity(intent);
    }//end view scores on click
}