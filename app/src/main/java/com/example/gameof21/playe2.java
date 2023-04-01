package com.example.gameof21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class playe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playe2);
    }

    public int i;
    //to disappear buttons after clicked by players
    public int but1(View view) {

        ImageButton b1 = findViewById(R.id.button1);
        i = 1;
        b1.setVisibility(View.GONE);

        return i;
    }

    public int but2(View view) {
        if (i == 1) {
            ImageButton b2 = findViewById(R.id.button2);
            i = 2;
            b2.setVisibility(View.GONE);

        }
        return i;
    }

    public int but3(View view) {
        if (i == 2) {
            ImageButton b3 = findViewById(R.id.button3);
            i = 3;
            b3.setVisibility(View.GONE);

        }
        return i;

    }

    public int but4(View view) {
        if (i == 3) {
            ImageButton b4 = findViewById(R.id.button4);
            i = 4;
            b4.setVisibility(View.GONE);

        }
        return i;
    }

    public int but5(View view) {
        if (i == 4) {
            ImageButton b5 = findViewById(R.id.button5);
            i = 5;
            b5.setVisibility(View.GONE);

        }
        return i;
    }

    public int but6(View view) {
        if (i == 5) {
            ImageButton b6 = findViewById(R.id.button6);
            i = 6;
            b6.setVisibility(View.GONE);

        }
        return i;
    }

    public int but7(View view) {
        if (i == 6) {
            ImageButton b7 = findViewById(R.id.button7);
            i = 7;
            b7.setVisibility(View.GONE);

        }
        return i;
    }

    public int but8(View view) {
        if (i == 7) {
            ImageButton b8 = findViewById(R.id.button8);
            i = 8;
            b8.setVisibility(View.GONE);

        }
        return i;
    }

    public int but9(View view) {
        if (i == 8) {
            ImageButton b9 = findViewById(R.id.button9);
            i = 9;
            b9.setVisibility(View.GONE);

        }
        return i;
    }

    public int but10(View view) {
        if (i == 9) {
            ImageButton b10 = findViewById(R.id.button10);
            i = 10;
            b10.setVisibility(View.GONE);

        }
        return i;
    }

    public int but11(View view) {
        if (i == 10) {
            ImageButton b11 = findViewById(R.id.button11);
            i = 11;
            b11.setVisibility(View.GONE);

        }
        return i;
    }

    public int but12(View view) {
        if (i == 11) {
            ImageButton b12 = findViewById(R.id.button12);
            i = 12;
            b12.setVisibility(View.GONE);

        }
        return i;
    }

    public int but13(View view) {
        if (i == 12) {
            ImageButton b13 = findViewById(R.id.button13);
            i = 13;
            b13.setVisibility(View.GONE);

        }
        return i;
    }

    public int but14(View view) {
        if (i == 13) {
            ImageButton b14 = findViewById(R.id.button14);
            i = 14;
            b14.setVisibility(View.GONE);

        }
        return i;
    }

    public int but15(View view) {
        if (i == 14) {
            ImageButton b15 = findViewById(R.id.button15);
            i = 15;
            b15.setVisibility(View.GONE);

        }
        return i;
    }

    public int but16(View view) {
        if (i == 15) {
            ImageButton b16 = findViewById(R.id.button16);
            i = 16;
            b16.setVisibility(View.GONE);

        }
        return i;
    }

    public int but17(View view) {
        if (i == 16) {
            ImageButton b17 = findViewById(R.id.button17);
            i = 17;
            b17.setVisibility(View.GONE);

        }
        return i;
    }

    public int but18(View view) {
        if (i == 17) {
            ImageButton b18 = findViewById(R.id.button18);
            i = 18;
            b18.setVisibility(View.GONE);

        }
        return i;
    }

    public int but19(View view) {
        if (i == 18) {
            ImageButton b19 = findViewById(R.id.button19);
            i = 19;
            b19.setVisibility(View.GONE);

        }
        return i;
    }

    public int but20(View view) {
        if (i == 19) {
            ImageButton b20 = findViewById(R.id.button20);
            i = 20;
            b20.setVisibility(View.GONE);

        }
        return i;
    }

    public void but21(View view) {
        if (i == 20) {
            ImageButton b21 = findViewById(R.id.button21);
            //TextView textView2 = findViewById(R.id.resultp1);
            //textView2.setText("You lose");
            i = 21;
            b21.setVisibility(View.GONE);
        }
    }


    }