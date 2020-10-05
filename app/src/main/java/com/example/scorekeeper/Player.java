package com.example.scorekeeper;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import java.util.ArrayList;

public class Player implements Parcelable {
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

    //compares list of players and returns the largest
    public static ArrayList<Player> rank(ArrayList<Player> playerList)
    {
        Player indivPlayer = playerList.get(0);
        ArrayList<Player> output = new ArrayList<Player>();
        Log.i("RankedPlayer", "------before for loop-------");
        for(int i = 0; i < playerList.size(); i++)
        {
            for(int j = i; j <playerList.size(); i++)
            {
                Log.i("RankedPlayer", "------inner for loop-------");
               indivPlayer = comparePlayerScores(playerList.get(i), playerList.get(j));
            }//end inner for
            Log.i("RankedPlayer: ", i + ": " + indivPlayer);
            output.add(indivPlayer);
            playerList.remove(i);
        }//end outer for
        return output;
    }//end compareManyPlayerScores method

    //compares the scores of two players
    private static Player comparePlayerScores(Player firstPlayer, Player secondPlayer)
    {
        int first = firstPlayer.getScore();
        int second = secondPlayer.getScore();

        if(first > second)
        {
            return firstPlayer;
        }
        return secondPlayer;
    }//end method to compare players

    //making Player objects parceable

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            out.writeString(name);
            out.writeInt(score);
        }

        public static final Parcelable.Creator<Player> CREATOR
                = new Parcelable.Creator<Player>() {
            public Player createFromParcel(Parcel in) {
                return new Player(in);
            }

            public Player[] newArray(int size) {
                return new Player[size];
            }
        };

        private Player(Parcel in) {
            name = in.readString();
            score = in.readInt();
        }

    public String toString()
    {
        String output = "Player Name: " + name;
        output +=       "\nPlayer Score: " + score;
        output +=       "\nTotal Number of PLayers: " + numPlayers;
        return output;
    }//end toString
}//end Player class
