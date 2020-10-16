package com.example.scorekeeper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewGameScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game_screen);

        // get prompts.xml view
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(sharedPreferences.getBoolean("IS_FIRST_TIME", true)) {
            LayoutInflater layoutInflater = LayoutInflater.from(this);

            View promptView = layoutInflater.inflate(R.layout.instructions_layout, null);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            // set prompts.xml to be the layout file of the alertdialog builder
            alertDialogBuilder.setView(promptView);
            // setup a dialog window
            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    })
                    .setNegativeButton("Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

            // create an alert dialog
            AlertDialog alertD = alertDialogBuilder.create();

            alertD.show();
            sharedPreferences.edit().putBoolean("IS_FIRST_TIME", false).apply();
        }
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
        EditText playToET = findViewById(R.id.playToNumberInput);

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

        //getting playTo value
        String num = playToET.getText().toString();
        int playTo;
        //checking if num has nothing in it
        //-1 means that there is no limit
        //in that case the game will continue until "end game" is pressed
        if(num.equals(""))
        {
            playTo = -1;
        }
        else
        {
            playTo = Integer.parseInt(num);
        }


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
        intent.putExtra("playTo", playTo);

        //starting up activity
        startActivity(intent);
    }//end toGame

}//end newGameScreen