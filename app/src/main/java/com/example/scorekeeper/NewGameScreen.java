package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        EditText player1Input = (EditText)findViewById(R.id.player1Input);
        EditText player2Input = (EditText)findViewById(R.id.player2Input);
        EditText player3Input = (EditText)findViewById(R.id.player3Input);
        EditText player4Input = (EditText)findViewById(R.id.player4Input);
        EditText player5Input = (EditText)findViewById(R.id.player5Input);
        EditText player6Input = (EditText)findViewById(R.id.player6Input);
        EditText player7Input = (EditText) findViewById(R.id.player7Input);
        EditText player8Input = (EditText)findViewById(R.id.player8Input);

        //creating vars
        String player1Name = "";
        String player2Name = "";
        String player3Name = "";
        String player4Name = "";
        String player5Name = "";
        String player6Name = "";
        String player7Name = "";
        String player8Name = "";

        //getting info from edit texts
        player1Name = player1Input.getText().toString();
        player2Name = player2Input.getText().toString();
        player3Name = player3Input.getText().toString();
        player4Name = player4Input.getText().toString();
        player5Name = player5Input.getText().toString();
        player6Name = player6Input.getText().toString();
        player7Name = player7Input.getText().toString();
        player8Name = player8Input.getText().toString();

        //to game screen
        Intent intent = new Intent(this, gameScreen.class);

        //passing that information to the next screen
        intent.putExtra("player1Name", player1Name);
        intent.putExtra("player2Name", player2Name);
        intent.putExtra("player3Name", player3Name);
        intent.putExtra("player4Name", player4Name);
        intent.putExtra("player5Name", player5Name);
        intent.putExtra("player6Name", player6Name);
        intent.putExtra("player7Name", player7Name);
        intent.putExtra("player8Name", player8Name);

        //starting up activity
        startActivity(intent);
    }//end toGame

}//end newGameScreen