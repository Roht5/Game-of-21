package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class hard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
        //ConstraintLayout linearLayout = (ConstraintLayout) findViewById(R.id.gameover);
        //linearLayout.setVisibility(View.GONE);

    }
    public int i;
    public int f;
    public int r=0;
    int sum;
    //to disappear buttons after clicked by players
    public int but1(View view){

        ImageButton b1 = findViewById(R.id.button1);
        i=1;
        b1.setVisibility(View.GONE);
        count(1);
        return i;
    }

    public int but2(View view){
        if(i==1) {
            ImageButton b2 = findViewById(R.id.button2);
            i = 2;
            b2.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but3(View view){
        if(i==2) {
            ImageButton b3 = findViewById(R.id.button3);
            i = 3;
            b3.setVisibility(View.GONE);
            count(1);
        }
            return i ;

    }
    public int but4(View view){
        if(i==3) {
            ImageButton b4 = findViewById(R.id.button4);
            i = 4;
            b4.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but5(View view){
        if(i==4) {
            ImageButton b5 = findViewById(R.id.button5);
            i = 5;
            b5.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but6(View view){
        if(i==5) {
            ImageButton b6 = findViewById(R.id.button6);
            i = 6;
            b6.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but7(View view){
        if(i==6) {
            ImageButton b7 = findViewById(R.id.button7);
            i = 7;
            b7.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but8(View view){
        if(i==7) {
            ImageButton b8 = findViewById(R.id.button8);
            i = 8;
            b8.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but9(View view){
        if(i==8) {
            ImageButton b9 = findViewById(R.id.button9);
            i = 9;
            b9.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but10(View view){
        if(i==9) {
            ImageButton b10 = findViewById(R.id.button10);
            i = 10;
            b10.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but11(View view){
        if(i==10) {
            ImageButton b11 = findViewById(R.id.button11);
            i = 11;
            b11.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but12(View view){
        if(i==11) {
            ImageButton b12 = findViewById(R.id.button12);
            i = 12;
            b12.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but13(View view){
        if(i==12) {
            ImageButton b13 = findViewById(R.id.button13);
            i = 13;
            b13.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but14(View view){
        if(i==13) {
            ImageButton b14 = findViewById(R.id.button14);
            i = 14;
            b14.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but15(View view){
        if(i==14) {
            ImageButton b15 = findViewById(R.id.button15);
            i = 15;
            b15.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but16(View view){
        if(i==15) {
            ImageButton b16 = findViewById(R.id.button16);
            i = 16;
            b16.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but17(View view){
        if(i==16) {
            ImageButton b17 = findViewById(R.id.button17);
            i = 17;
            b17.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but18(View view){
        if(i==17) {
            ImageButton b18 = findViewById(R.id.button18);
            i = 18;
            b18.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but19(View view){
        if(i==18) {
            ImageButton b19 = findViewById(R.id.button19);
            i = 19;
            b19.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but20(View view){
        if(i==19) {
            ImageButton b20 = findViewById(R.id.button20);
            i = 20;
            b20.setVisibility(View.GONE);
            count(1);
        }
        return i;
    }
    public int but21(View view){
        if(i==20) {
            ImageButton b21 = findViewById(R.id.button21);
            //TextView textView2 = findViewById(R.id.resultp1);
            //textView2.setText("You lose");
            //ConstraintLayout linearLayout = (ConstraintLayout) findViewById(R.id.gameover);
            //linearLayout.setVisibility(View.VISIBLE);
            i = 21;
            b21.setVisibility(View.GONE);
            count(1);
            ImageButton submit =findViewById(R.id.submit);
            submit.setVisibility(View.GONE);
        }
        return i;
    }
// Is function we have declred to avoid more than 3 numbers input at a time
    public int count(int r){
        f=f+r;
        if(f==3) {
            i--;
        }
        return f&i;
    }


    public int submit(View view){
        if(f==3) {
            i++;
        }

        if(f!= 0) {
            comp(i);
        }
        return f=0;
    }
    public void time(int i){

        comp(i);
    }
    //restart
//    public void rest(View view) {
//        Button res = findViewById(R.id.res);
//        Intent intent = new Intent(this, hard.class);
//        startActivity(intent);
//    }
//    public void hom(View view) {
//        Button res = findViewById(R.id.hom);
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
    public void comp(int i){
        int num = 0;
        if(i%4==1){
            num=3;
        }
        if(i%4==2){
            num=2;
        }
        if(i%4==3){
            num=1;
        }
        if(i%4==0){
            num=1;
        }
        for(int j=0; j<num;j++){
            i++;
            disappear(i);
        }
    }
    
    public int disappear(int r){
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

                TextView textView2=findViewById(R.id.resultp1);
                textView2.setText("Computer lose");
                break;


        }

        return i&f;

    }
}