package com.example.scorekeeper;

public class Player {
    private String name;
    private int score;
    private static int numPlayers = 0;
    public Player(String name) {
        this.name = name;
        this.score = 0;
        numPlayers++;
    }//end constructor

    //method will add certain amount of points depending on button pressed
    public void addPoints(int add)
    {
        score = score + add;
    }//end addPoints method

    //sets score back to 0
    public void resetScore()
    {
        score = 0;
    }//end resetScore

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
}//end Player class
