package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewGameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game_screen);

    }
    public void toGame(View view)
    {
        //retreiving inormation from the edit views
        EditText player1Input = findViewById(R.id.player1Input);
        String player1Name =  player1Input.getText().toString();

        EditText player2Input = findViewById(R.id.player2Input);
        String player2Name =  player2Input.getText().toString();

        EditText player3Input = findViewById(R.id.player3Input);
        String player3Name =  player3Input.getText().toString();

        EditText player4Input = findViewById(R.id.player4Input);
        String player4Name =  player4Input.getText().toString();

        EditText player5Input = findViewById(R.id.player5Input);
        String player5Name =  player5Input.getText().toString();

        EditText player6Input = findViewById(R.id.player6Input);
        String player6Name =  player6Input.getText().toString();

        EditText player7Input = findViewById(R.id.player7Input);
        String player7Name =  player7Input.getText().toString();

        EditText player8Input = findViewById(R.id.player8Input);
        String player8Name =  player8Input.getText().toString();

        //to game screen
        Intent intent = new Intent(this, gameScreen.class);
        startActivity(intent);

        //passing that information to the next screen
        intent.putExtra("player1Name", player1Name);
        intent.putExtra("player2Name", player2Name);
        intent.putExtra("player3Name", player3Name);
        intent.putExtra("player4Name", player4Name);
        intent.putExtra("player5Name", player5Name);
        intent.putExtra("player6Name", player6Name);
        intent.putExtra("player7Name", player7Name);
        intent.putExtra("player8Name", player8Name);
    }//end toGame

}//end newGameScreen