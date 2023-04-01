package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void play2(View view){
        Button b1 = findViewById(R.id.player2);
        Intent intent = new Intent(this, playe2.class);
        startActivity(intent);
    }
    public void play1(View view){
        Button b1 = findViewById(R.id.player2);
        Intent intent = new Intent(this, comp.class);
        startActivity(intent);
    }
    public void help(View view){
        Button b1 = findViewById(R.id.player2);
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }
}