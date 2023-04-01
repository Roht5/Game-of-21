package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class comp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);
    }
    public void easy(View view){
        Button b1 = findViewById(R.id.player2);
        Intent intent = new Intent(this, playe1.class);
        startActivity(intent);
    }
    public void hard(View view){
        Button b1 = findViewById(R.id.player2);
        Intent intent = new Intent(this, hard.class);
        startActivity(intent);
    }
}