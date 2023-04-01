package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class playe1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playe1);

    }
    public int f;
    public int i;
    public int r;
    String st="button"+i;
    public int but1(View view){
        ImageButton b1 = findViewById(R.id.button1);
        i=1;
        count(1);
        b1.setVisibility(View.GONE);
        return i=1;
    }
    public int but2(View view){
        if(i==1) {
            ImageButton b2 = findViewById(R.id.button2);
            i = 2;
            count(1);
            b2.setVisibility(View.GONE);
        }
            return i ;

    }
    public int but3(View view){
        if (i==2){


        ImageButton b3 = findViewById(R.id.button3);
        i=3;
            count(1);
        b3.setVisibility(View.GONE);
        }
        return i;
    }
    public int but4(View view){
        if (i==3){


        ImageButton b4 = findViewById(R.id.button4);
        i=4;
            count(1);
        b4.setVisibility(View.GONE);
        }
        return i;
    }
    public int but5(View view){
        if (i==4) {

            ImageButton b5 = findViewById(R.id.button5);
            i = 5;
            count(1);
            b5.setVisibility(View.GONE);
        }
        return i;
    }
    public int but6(View view){
        if (i==5) {

            ImageButton b6 = findViewById(R.id.button6);
            i = 6;
            count(1);
            b6.setVisibility(View.GONE);
        }
        return i;
    }
    public int but7(View view){
        if (i==6) {

            ImageButton b7 = findViewById(R.id.button7);
            i = 7;
            count(1);
            b7.setVisibility(View.GONE);
        }
        return i;
    }
    public int but8(View view){
        if (i==7) {

            ImageButton b8 = findViewById(R.id.button8);
            i = 8;
            count(1);
            b8.setVisibility(View.GONE);
        }
        return i;
    }
    public int but9(View view){
        if (i==8) {

            ImageButton b9 = findViewById(R.id.button9);
            i = 9;
            count(1);
            b9.setVisibility(View.GONE);
        }
        return i;
    }
    public int but10(View view){
        if (i==9) {
            ImageButton b10 = findViewById(R.id.button10);
            i = 10;
            count(1);
            b10.setVisibility(View.GONE);
        }
        return i;
    }
    public int but11(View view){
        if (i==10) {
            ImageButton b11 = findViewById(R.id.button11);
            i = 11;
            count(1);
            b11.setVisibility(View.GONE);
        }
        return i;
    }
    public int but12(View view){
        if (i==11) {
            ImageButton b12 = findViewById(R.id.button12);
            i = 12;
            count(1);
            b12.setVisibility(View.GONE);
        }
        return i;
    }
    public int but13(View view){
        if (i==12) {
            ImageButton b13 = findViewById(R.id.button13);
            i = 13;
            count(1);
            b13.setVisibility(View.GONE);
        }
        return i;
    }
    public int but14(View view){
        if (i==13) {
            ImageButton b14 = findViewById(R.id.button14);
            i = 14;
            count(1);
            b14.setVisibility(View.GONE);
        }
        return i;
    }
    public int but15(View view){
        if (i==14) {
            ImageButton b15 = findViewById(R.id.button15);
            i = 15;
            count(1);
            b15.setVisibility(View.GONE);
        }
        return i;
    }
    public int but16(View view){
        if (i==15) {
            ImageButton b16 = findViewById(R.id.button16);
            i = 16;
            count(1);
            b16.setVisibility(View.GONE);
        }
        return i;
    }
    public int but17(View view){
        if (i==16) {
            ImageButton b17 = findViewById(R.id.button17);
            i = 17;
            count(1);
            b17.setVisibility(View.GONE);
        }
        return i;
    }
    public int but18(View view){
        if (i==17) {
            ImageButton b18 = findViewById(R.id.button18);
            i = 18;
            count(1);
            b18.setVisibility(View.GONE);
        }
        return i;
    }
    public int but19(View view){
        if (i==18) {
            ImageButton b19 = findViewById(R.id.button19);
            i = 19;
            count(1);
            b19.setVisibility(View.GONE);
        }
        return i;
    }
    public int but20(View view){
        if (i==19) {
            ImageButton b20 = findViewById(R.id.button20);
            i = 20;
            count(1);
            b20.setVisibility(View.GONE);
        }
        return i;
    }
    public int but21(View view){
        if (i==20) {
            ImageButton b21 = findViewById(R.id.button21);
            TextView textView2 = findViewById(R.id.resultp1);
            textView2.setText("You lose");
            i = 21;
            count(1);
            b21.setVisibility(View.GONE);
        }
        return i=21;
    }

    public int count(int r){
        f=f+r;
        if (f==3){
            i--;
        }
        return f&i;
    }
    //    public int ret(int i){
//        ++;
//        return r;
//    }
    public void submit(View view){
      if (f==3){
          i++;
      }
        comp(i);
    }
    public void comp(int i){
        Random dice = new Random();
        int num = 1+dice.nextInt(2);
        for(int j=0; j<=num;j++){
            i++;
            compare(i);
        }
    }
    public void compare(int r){
        switch(r){
            case 1:
                ImageButton b1 = findViewById(R.id.button1);
                b1.setVisibility(View.GONE);
                i=1;
                break;

            case 2:
                ImageButton b2 = findViewById(R.id.button2);
                b2.setVisibility(View.GONE);
                i=2;
                break;


            case 3:
                ImageButton b3 = findViewById(R.id.button3);
                b3.setVisibility(View.GONE);
                i=3;
                break;

            case 4:
                ImageButton b4 = findViewById(R.id.button4);
                b4.setVisibility(View.GONE);
                i=4;
                break;

            case 5:
                ImageButton b5 = findViewById(R.id.button5);
                b5.setVisibility(View.GONE);
                i=5;
                break;


            case 6:
                ImageButton b6 = findViewById(R.id.button6);
                b6.setVisibility(View.GONE);
                i=6;
                break;

            case 7:
                ImageButton b7 = findViewById(R.id.button7);
                b7.setVisibility(View.GONE);
                i=7;
                break;

            case 8:
                ImageButton b8 = findViewById(R.id.button8);
                b8.setVisibility(View.GONE);
                i=8;
                break;

            case 9:
                ImageButton b9 = findViewById(R.id.button9);
                b9.setVisibility(View.GONE);
                i=9;
                break;

            case 10:
                ImageButton b10 = findViewById(R.id.button10);
                b10.setVisibility(View.GONE);
                i=10;
                break;

            case 11:
                ImageButton b11 = findViewById(R.id.button11);
                b11.setVisibility(View.GONE);
                i=11;
                break;

            case 12:
                ImageButton b12 = findViewById(R.id.button12);
                b12.setVisibility(View.GONE);
                i=12;
                break;

            case 13:
                ImageButton b13 = findViewById(R.id.button13);
                b13.setVisibility(View.GONE);
                i=13;
                break;

            case 14:
                ImageButton b14 = findViewById(R.id.button14);
                b14.setVisibility(View.GONE);
                i=14;
                break;

            case 15:
                ImageButton b15 = findViewById(R.id.button15);
                b15.setVisibility(View.GONE);
                i=15;
                break;

            case 16:
                ImageButton b16 = findViewById(R.id.button16);
                b16.setVisibility(View.GONE);
                i=16;
                break;

            case 17:
                ImageButton b17 = findViewById(R.id.button17);
                b17.setVisibility(View.GONE);
                i=17;
                break;

            case 18:
                ImageButton b18 = findViewById(R.id.button18);
                b18.setVisibility(View.GONE);
                i=18;
                break;

            case 19:
                ImageButton b19 = findViewById(R.id.button19);
                b19.setVisibility(View.GONE);
                i=19;
                break;
            case 20:
                ImageButton b20 = findViewById(R.id.button20);
                b20.setVisibility(View.GONE);
                i=20;
                break;

            case 21:
                ImageButton b21 = findViewById(R.id.button21);
                b21.setVisibility(View.GONE);
                i=21;
                TextView textView2=findViewById(R.id.resultp1);
                textView2.setText("Computer lose");
                break;


        }
    }
}