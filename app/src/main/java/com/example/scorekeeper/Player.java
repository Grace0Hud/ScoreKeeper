package com.example.scorekeeper;

import android.util.Log;

import java.util.ArrayList;

public class Player {
    private String name;
    private int score;
    private static int numPlayers = 0;
    public Player(String name) {
        this.name = name;
        score = 0;
        numPlayers++;
        //Log.i("addPoints/amt Players: " ,"------- " + numPlayers + "--------");
    }//end constructor

    //method will add certain amount of points depending on button pressed
    public void addPoints(int add)
    {
        score += add;

    }//end addPoints method

    //sets score back to 0
    public void resetScore()
    {
        score = 0;
    }//end resetScore

    //for use in ranking methods
    public int getScore()
    {
        return score;
    }//end getScore

    public void setPlayerName(String name)
    {
        this.name = name;
    }//end setName

    public String getPlayerName()
    {
        return name;
    }//end get name

    public void resetNumPlayers()
    {
        numPlayers = 0;
    }//end resetNumPlayers

    public static int getNumPlayers()
    {
        return numPlayers;
    }//end getNumPlayers

    public ArrayList<Player> rank(ArrayList<Player> playerList)
    {
        ArrayList<Player> output = new ArrayList<Player>();
       for(int i = 0; i < playerList.size(); i++)
       {
          output.add(compareManyPlayerScores(playerList));
          playerList.remove(i);
       }//end for loop
        return output;
    }//end rank method

    //compares list of players and returns the largest
    private Player compareManyPlayerScores(ArrayList<Player> playerList)
    {
        Player output = playerList.get(0);
        for(int i = 0; i < playerList.size(); i++)
        {
            for(int j = i; j <playerList.size(); i++)
            {
               output = comparePlayerScores(playerList.get(i), playerList.get(j));
            }//end inner for
        }//end outer for
        return output;
    }//end compareManyPlayerScores method

    //compares the scores of two players
    private Player comparePlayerScores(Player firstPlayer, Player secondPlayer)
    {
        int first = firstPlayer.getScore();
        int second = secondPlayer.getScore();

        if(first > second)
        {
            return firstPlayer;
        }
        return secondPlayer;
    }//end method to compare players
    public String toString()
    {
        String output = "Player Name: " + name;
        output +=       "\nPlayer Score: " + score;
        output +=       "\nTotal Number of PLayers: " + numPlayers;
        return output;
    }//end toString
}//end Player class
