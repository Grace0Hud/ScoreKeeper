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

    public void resetPoints()
    {
        score = 0;
    }
}//end Player class
