package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gameScreen extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        String player1Name = getIntent().getStringExtra("player1Name");
        String player2Name = getIntent().getStringExtra("player2Name");
        String player3Name = getIntent().getStringExtra("player3Name");
        String player4Name = getIntent().getStringExtra("player4Name");
        String player5Name = getIntent().getStringExtra("player5Name");
        String player6Name = getIntent().getStringExtra("player6Name");
        String player7Name = getIntent().getStringExtra("player7Name");
        String player8Name = getIntent().getStringExtra("player8Name");

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        Player player3 = new Player(player3Name);
        Player player4 = new Player(player4Name);
        Player player5 = new Player(player5Name);
        Player player6 = new Player(player6Name);
        Player player7 = new Player(player7Name);
        Player player8 = new Player(player8Name);

        Button player1Button = findViewById(R.id.player1Display);
        player1Button.setText(player1.getPlayerName() + ": " + player1.getScore());
        Button player2Button = findViewById(R.id.player2Display);
        player2Button.setText(player2.getPlayerName() + ": " + player2.getScore());
        Button player3Button = findViewById(R.id.player3Display);
        player3Button.setText(player3.getPlayerName() + ": " + player3.getScore());
        Button player4Button = findViewById(R.id.player4Display);
        player4Button.setText(player4.getPlayerName() + ": " + player4.getScore());
        Button player5Button = findViewById(R.id.player5Display);
        player5Button.setText(player5.getPlayerName() + ": " + player5.getScore());
        Button player6Button = findViewById(R.id.player6Display);
        player6Button.setText(player6.getPlayerName() + ": " + player6.getScore());
        Button player7Button = findViewById(R.id.player7Display);
        player7Button.setText(player7.getPlayerName() + ": " + player7.getScore());
        Button player8Button = findViewById(R.id.player8Display);
        player8Button.setText(player8.getPlayerName() + ": " + player8.getScore());
    }

    public void onClickEndGame(View view)
    {
        Intent intent = new Intent(this, winScreen.class);
        startActivity(intent);
    }//end onClickEndGame
}//end gameScreen