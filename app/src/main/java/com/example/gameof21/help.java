package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void hind(View view){
        Button b1 = findViewById(R.id.hindi);
        TextView textView2=findViewById(R.id.rules);
        textView2.setText("RULES:\n1.गेम 1  से शुरू होता है\n2. हम एक बार में अधिकतम अगली तीन लगातार संख्याएँ कह सकते हैं।\n3. जो भी 21 पर समाप्त होता है वह खेल को खो देता है");
    }
    public void eng(View view){
        Button b1 = findViewById(R.id.english);
        TextView textView2=findViewById(R.id.rules);
        textView2.setText("RULES:\n1.Game Starts From 1.\n2.We can say max next 3 consecutive numbers at a time.\n3.Whoever ends at 21 Looses the game.");
    }public void mar(View view){
        Button b1 = findViewById(R.id.marathi);
        TextView textView2=findViewById(R.id.rules);
        textView2.setText("RULES:\n1.गेम 1 पासून सुरू होतो\n2.आम्ही एका वेळी कमाल पुढील सलग तीन संख्या म्हणू शकतो.\n3. जो 21 व्या क्रमांकावर संपतो तो गेम गमावतो");
    }
}