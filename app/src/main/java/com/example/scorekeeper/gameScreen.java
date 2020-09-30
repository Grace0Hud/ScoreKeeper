package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class gameScreen extends AppCompatActivity
{

    private int clickedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        playerToggle(clickedButton, 0);

        /*

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

       // Log.i("Info: ", "---------" + player1.getPlayerScore() + "----------");

        //adding the players to an array list of players.
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);

        //playerButton arrayList
        ArrayList<Button> playerButtons = new ArrayList<>();

        //linking button objects to button resources
        Button player1Button = findViewById(R.id.player1Display);
        Button player2Button = findViewById(R.id.player2Display);
        Button player3Button = findViewById(R.id.player3Display);
        Button player4Button = findViewById(R.id.player4Display);
        Button player5Button = findViewById(R.id.player5Display);
        Button player6Button = findViewById(R.id.player6Display);
        Button player7Button = findViewById(R.id.player7Display);
        Button player8Button = findViewById(R.id.player8Display);

        //adding playerbuttons to array list
        playerButtons.add(player1Button);
        playerButtons.add(player2Button);
        playerButtons.add(player3Button);
        playerButtons.add(player4Button);
        playerButtons.add(player5Button);
        playerButtons.add(player6Button);
        playerButtons.add(player7Button);
        playerButtons.add(player8Button);

        //checking if a player name has been entered for the player object
        //if not, then the player button is set to invisible.
        //space cannot be occupied by other widgets but it won't be seen or presable by users
        for(int i = 0; i< players.size(); i++)
        {
            if(players.get(i).getPlayerName().equals(""))
            {
                playerButtons.get(i).setVisibility(View.INVISIBLE);
            }
            else
            {
                playerButtons.get(i).setText(players.get(i).getPlayerName() + ": " + players.get(i).getScore());
            }
        }//end for loop
         */
        //obsolete code (keep just in case)
        /*
        player1Button.setText(player1.getPlayerName() + ": \n" + player1.getScore());
        player2Button.setText(player2.getPlayerName() + ": " + player2.getScore());
        player3Button.setText(player3.getPlayerName() + ": " + player3.getScore());
        player4Button.setText(player4.getPlayerName() + ": " + player4.getScore());
        player5Button.setText(player5.getPlayerName() + ": " + player5.getScore());
        player6Button.setText(player6.getPlayerName() + ": " + player6.getScore());
        player7Button.setText(player7.getPlayerName() + ": " + player7.getScore());
        player8Button.setText(player8.getPlayerName() + ": " + player8.getScore());
        */



    }//end on create

    public void onClickPlayer1Button(View view)
    {
        clickedButton = 1;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end first player on click

    public void onClickPlayer2Button(View view)
    {
        clickedButton = 2;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 2nd player on click

    public void onClickPlayer3Button(View view)
    {
        clickedButton = 3;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 3rd player on click

    public void onClickPlayer4Button(View view)
    {
        clickedButton = 4;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 4th player on click
    public void onClickPlayer5Button(View view)
    {
        clickedButton = 5;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 5th player on click
    public void onClickPlayer6Button(View view)
    {
        clickedButton = 6;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 6th player on click
    public void onClickPlayer7Button(View view)
    {
        clickedButton = 7;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 7th player on click
    public void onClickPlayer8Button(View view)
    {
        clickedButton = 8;
        Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 8th player on click

    public void onClickEndGame(View view)
    {
        Intent intent = new Intent(this, winScreen.class);
        startActivity(intent);
    }//end onClickEndGame

    public void onClickMinus10(View view)
    {
        playerToggle(clickedButton, -10);
    }//end minus 10 onC

    private void playerToggle(int player, int num)
    {
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

        // Log.i("Info: ", "---------" + player1.getPlayerScore() + "----------");

        //adding the players to an array list of players.
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);

        //playerButton arrayList
        ArrayList<Button> playerButtons = new ArrayList<>();

        //linking button objects to button resources
        Button player1Button = findViewById(R.id.player1Display);
        Button player2Button = findViewById(R.id.player2Display);
        Button player3Button = findViewById(R.id.player3Display);
        Button player4Button = findViewById(R.id.player4Display);
        Button player5Button = findViewById(R.id.player5Display);
        Button player6Button = findViewById(R.id.player6Display);
        Button player7Button = findViewById(R.id.player7Display);
        Button player8Button = findViewById(R.id.player8Display);

        //adding playerbuttons to array list
        playerButtons.add(player1Button);
        playerButtons.add(player2Button);
        playerButtons.add(player3Button);
        playerButtons.add(player4Button);
        playerButtons.add(player5Button);
        playerButtons.add(player6Button);
        playerButtons.add(player7Button);
        playerButtons.add(player8Button);

        if(player == 0)
        {
            //checking if a player name has been entered for the player object
            //if not, then the player button is set to invisible.
            //space cannot be occupied by other widgets but it won't be seen or presable by users
            for(int i = 0; i< players.size(); i++)
            {
                if(players.get(i).getPlayerName().equals(""))
                {
                    playerButtons.get(i).setVisibility(View.INVISIBLE);
                }
                else
                {
                    playerButtons.get(i).setText(players.get(i).getPlayerName() + ": " + players.get(i).getScore());
                }
            }//end for loop
        }//end set up validation

        //checks which player is selected
        //then adds the number of points specified
        //then updates textview
        for(int i = 0; i < players.size(); i++)
        {
            if(i == (player-1))
            {
                players.get(i).addPoints(num);
                playerButtons.get(i).setText(players.get(i).getPlayerName() + ": " + players.get(i).getScore());
            }//end if validating which player
        }//end for cycling through player and button arrays

    }//end toggle buttons method
}//end gameScreen