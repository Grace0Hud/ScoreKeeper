package com.example.scorekeeper;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Player implements Parcelable,Comparable<Player>{
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
        ArrayList output = playerList;
        Collections.sort(output);

            /*
            ArrayList<Player> temp = playerList;
            ArrayList<Player> output = new ArrayList<>();

            for(int i = 0; i < temp.size(); i++)
            {
                Player indivPlayer = temp.get(i);
                for(int j = i + 1; j < temp.size(); j++)
                {
                   Player checkPlayer = temp.get(j);
                    if(checkPlayer.getScore() > indivPlayer.getScore())
                    {
                        indivPlayer = checkPlayer;
                    }//inner if
                }//inner for
                output.add(indivPlayer);
               System.out.println("Player " + i + ": " + indivPlayer.getPlayerName());
                temp.remove(i);
            }//end outer for loop
            //System.out.println("--------------------------------------");
            return output;


             */
        /*
        //Log.i("RankedPlayer", "------start of method-------");
        Player indivPlayer = playerList.get(0);
        ArrayList<Player> output = new ArrayList<Player>();
       // Log.i("RankedPlayer", "------before for loop-------");
        for(int i = 0; i < playerList.size(); i++)
        {
            for(int j = i; j <playerList.size(); j++)
            {
                //Log.i("RankedPlayer", "------inner for loop-------");
               indivPlayer = comparePlayerScores(playerList.get(i), playerList.get(j));
            }//end inner for
            Log.i("RankedPlayer: ", i + ": " + indivPlayer.getPlayerName() + ", Score: " + indivPlayer.getScore());
            output.add(indivPlayer);
            playerList.remove(i);
        }//end outer for
        return output;

         */
        return output;
    }//end compareManyPlayerScores method


    /*
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

     */

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int compareTo(Player player)
    {
        return Integer.compare(player.getScore(), this.getScore());
    }
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
