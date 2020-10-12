package com.example.scorekeeper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class gameScreen extends AppCompatActivity
{


    private int clickedButton;
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Button> playerButtons = new ArrayList<>();
    int pointLimit;

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

        ArrayList<String> playerNames = new ArrayList();
        playerNames.add(player1Name);
        playerNames.add(player2Name);
        playerNames.add(player3Name);
        playerNames.add(player4Name);
        playerNames.add(player5Name);
        playerNames.add(player6Name);
        playerNames.add(player7Name);
        playerNames.add(player8Name);

        //retrieving playTo information
        pointLimit = getIntent().getIntExtra("playTo", -1);


        /*
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

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);

*/
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

        //creating player objects and adding them to the array
        //the goal of this is to not add any player objects that have not been named
        for(int i = 0; i < playerNames.size(); i++)
        {
            if(!playerNames.get(i).equals(""))
            {
                players.add(new Player(playerNames.get(i)));
                playerButtons.get(i).setText(players.get(i).getPlayerName() + ": " + players.get(i).getScore());
            }
            else
            {
                playerButtons.get(i).setVisibility(View.INVISIBLE);
            }
        }

        /*
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
        //testing and debugging of rank method
        //Player.rank(players);
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

    public void onClickEndGame(View view)
    {
        Intent intent = new Intent(this, winScreen.class);

        //found the problem line
        //problem in rank method
        ArrayList<Player> rankedPlayers = Player.rank(players);

        //Player testPlayer = new Player("test");
        intent.putExtra("players", rankedPlayers);
        //intent.putExtra("winner", testPlayer);
        //starts up win screen
        startActivity(intent);
    }//end onClickEndGame

    public void onClickAddPlayer(View view) {
        // get prompts.xml view
        LayoutInflater layoutInflater = LayoutInflater.from(this);

        View promptView = layoutInflater.inflate(R.layout.add_player_dialogue, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // set prompts.xml to be the layout file of the alertdialog builder
        alertDialogBuilder.setView(promptView);

        final EditText input = (EditText) promptView.findViewById(R.id.newPlayerName);

        // setup a dialog window
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // get user input and set it to result
                        // editTextMainScreen.setText(input.getText());
                        players.add(new Player(input.getText().toString()));
                        playerButtons.get(players.size()-1).setText(players.get(players.size()-1).getPlayerName() + ": " + players.get(players.size()-1).getScore());
                        playerButtons.get(players.size()-1).setVisibility(View.VISIBLE);

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
}

    //when player buttons are clicked
    public void onClickPlayer1Button(View view)
    {
        clickedButton = 1;
        updateScoreTV(0);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end first player on click

    public void onClickPlayer2Button(View view)
    {
        clickedButton = 2;
        updateScoreTV(1);
       // Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 2nd player on click

    public void onClickPlayer3Button(View view)
    {
        clickedButton = 3;
        updateScoreTV(2);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 3rd player on click

    public void onClickPlayer4Button(View view)
    {
        clickedButton = 4;
        updateScoreTV(3);
       // Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 4th player on click
    public void onClickPlayer5Button(View view)
    {
        clickedButton = 5;
        updateScoreTV(4);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 5th player on click
    public void onClickPlayer6Button(View view)
    {
        clickedButton = 6;
        updateScoreTV(5);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 6th player on click
    public void onClickPlayer7Button(View view)
    {
        clickedButton = 7;
        updateScoreTV(6);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 7th player on click
    public void onClickPlayer8Button(View view)
    {
        clickedButton = 8;
        updateScoreTV(7);
        //Toast.makeText(this, String.valueOf(clickedButton), Toast.LENGTH_LONG).show();
    }//end 8th player on click


    //+/- button onCLicks

    public void onClickMinus10(View view)
    {
        playerToggle(clickedButton, -10);
    }//end minus 10 onClick

    public void onClickMinus5(View view)
    {
        playerToggle(clickedButton, -5);
    }//end minus 10 onClick

    public void onClickMinus1(View view)
    {
        playerToggle(clickedButton, -1);
    }//end minus 1 onClick

    public void onClickAdd1(View view)
    {
        playerToggle(clickedButton, 1);
    }//end add 1 onClick

    public void onClickAdd5(View view)
    {
        playerToggle(clickedButton, 5);
    }//end add 5 onClick

    public void onClickAdd10(View view)
    {
        playerToggle(clickedButton, 10);
    }//end add 10 onClick


    private void playerToggle(int player, int num)
    {
        //checks which player is selected
        //then adds the number of points specified
        //then updates textview
       // Log.i("NumPlayers/1: ", "------- " + Player.getNumPlayers() + "--------");

        for(int i = 0; i < players.size(); i++)
        {
            if(i == (player-1))
            {
               // Log.i("NumPlayers/2: ", "------- " + Player.getNumPlayers() + "--------");
                players.get(i).addPoints(num);
               // Log.i("NumPlayers/3: ", "------- " + Player.getNumPlayers() + "--------");
                playerButtons.get(i).setText(players.get(i).getPlayerName() + ": " + players.get(i).getScore());
                updateScoreTV(i);

                //if a point limit has been set
                //and the player is above the point limit
                //that player wins

                if((pointLimit > 0) && (players.get(i).getScore() >= pointLimit))
                {
                    Intent intent = new Intent(this, winScreen.class);
                    //intent.putExtra("winner", players.get(i).getPlayerName());
                    ArrayList<Player> rankedPlayers = Player.rank(players);
                    intent.putExtra("players", rankedPlayers);
                    startActivity(intent);
                }//end if win

            }//end if validating which player
        }//end for cycling through player and button arrays
    }//end toggle buttons method

    public void updateScoreTV(int player)
    {
        TextView scoreTV = findViewById(R.id.largeScoreTV);
        scoreTV.setText(players.get(player).getScore() + "");
    }


}//end gameScreen