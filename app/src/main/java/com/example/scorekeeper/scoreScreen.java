package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class scoreScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen2);
    }

    public void onClickNewGameScoreScreen(View view)
    {
        Intent intent = new Intent(this, NewGameScreen.class);
        startActivity(intent);
    }

}