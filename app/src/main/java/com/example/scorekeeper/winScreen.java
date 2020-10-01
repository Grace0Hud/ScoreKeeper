package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class winScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);

        //displaying the name of the winning player
        String winner = getIntent().getStringExtra("winner");
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