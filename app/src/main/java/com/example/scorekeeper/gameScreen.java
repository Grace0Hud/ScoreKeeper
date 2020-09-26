package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gameScreen extends AppCompatActivity
{
    String player1Name = getIntent().getStringExtra("player1Name");
    String player2Name = getIntent().getStringExtra("player2Name");
    String player3Name = getIntent().getStringExtra("player3Name");
    String player4Name = getIntent().getStringExtra("player4Name");
    String player5Name = getIntent().getStringExtra("player5Name");
    String player6Name = getIntent().getStringExtra("player6Name");
    String player7Name = getIntent().getStringExtra("player7Name");
    String player8Name = getIntent().getStringExtra("player8Name");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
    }

    public void onClickEndGame(View view)
    {
        Intent intent = new Intent(this, winScreen.class);
        startActivity(intent);
    }//end onClickEndGame
}//end gameScreen