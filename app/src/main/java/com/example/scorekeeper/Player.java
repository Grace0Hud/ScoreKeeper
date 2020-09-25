package com.example.scorekeeper;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }//end constructor

    public void addPoints(int add)
    {
        score = score + add;
    }//end addPoints method

    public void resetScore()
    {
        score = 0;
    }//end resetScore

    public int getScore()
    {
        return score;
    }//end getScore

}//end Player class
