package com.leont.con3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int countmov=0;
    boolean f=false;
    int[][] mat=new int[3][3];
    boolean w=false;
    public void click1(View view){

       if(countmov==0){
            Random rand = new Random();
           int  n = rand.nextInt(2);
           if(n==0) {
                mat[0][0] = 1;
                ImageView o1 = findViewById(R.id.orange1);
                o1.animate().translationYBy(1000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[0][0] = 2;
                ImageView b1=findViewById(R.id.blue1);
                b1.animate().translationYBy(1000f).setDuration(2000);
                countmov++;
                f=true;
          }
      }
        else {
            if(mat[0][0]==0){
                if(f==false)
                {
                    mat[0][0]=2;
                    ImageView b1=findViewById(R.id.blue1);
                    b1.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[0][0]=1;
                    ImageView o1 = (ImageView) findViewById(R.id.orange1);
                    o1.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
           checkGameStatus();

       }

    }
    public void click2(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[0][1] = 1;
                ImageView o2 = (ImageView) findViewById(R.id.orange2);
                o2.animate().translationYBy(1000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[0][1] = 2;
                ImageView b2=findViewById(R.id.blue2);
                b2.animate().translationYBy(1000f).setDuration(2000);
                countmov++;
                f=true;


            }
        }
        else {
            if(mat[0][1]==0){
                if(f==false)
                {
                    mat[0][1]=2;
                    ImageView b2=findViewById(R.id.blue2);
                    b2.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[0][1]=1;
                    ImageView o2 = (ImageView) findViewById(R.id.orange2);
                    o2.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }

    public void click3(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[0][2] = 1;
                ImageView o3 = (ImageView) findViewById(R.id.orange3);
                o3.animate().translationYBy(1000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[0][2] = 2;
                ImageView b3=findViewById(R.id.blue3);
                b3.animate().translationYBy(1000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[0][2]==0){
                if(f==false)
                {
                    mat[0][2]=2;
                    ImageView b3=findViewById(R.id.blue3);
                    b3.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[0][2]=1;
                    ImageView o3 = (ImageView) findViewById(R.id.orange3);
                    o3.animate().translationYBy(1000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }

    }
    public void click4(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[1][0] = 1;
                ImageView o4 = (ImageView) findViewById(R.id.orange4);
                o4.animate().translationYBy(2000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[1][0] = 2;
                ImageView b4=findViewById(R.id.blue4);
                b4.animate().translationYBy(2000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[1][0]==0){
                if(f==false)
                {
                    mat[1][0]=2;
                    ImageView b4=findViewById(R.id.blue4);
                    b4.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[1][0]=1;
                    ImageView o4 = (ImageView) findViewById(R.id.orange4);
                    o4.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }
    public void click5(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[1][1] = 1;
                ImageView o5 = (ImageView) findViewById(R.id.orange5);
                o5.animate().translationYBy(2000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[1][1] = 2;
                ImageView b5=findViewById(R.id.blue5);
                b5.animate().translationYBy(2000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[1][1]==0){
                if(f==false)
                {
                    mat[1][1]=2;
                    ImageView b5=findViewById(R.id.blue5);
                    b5.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[1][1]=1;
                    ImageView o5 = (ImageView) findViewById(R.id.orange5);
                    o5.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }
    public void click6(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[1][2] = 1;
                ImageView o6 = (ImageView) findViewById(R.id.orange6);
                o6.animate().translationYBy(2000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[1][2] = 2;
                ImageView b6=findViewById(R.id.blue6);
                b6.animate().translationYBy(2000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[1][2]==0){
                if(f==false)
                {
                    mat[1][2]=2;
                    ImageView b6=findViewById(R.id.blue6);
                    b6.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[1][2]=1;
                    ImageView o6 = (ImageView) findViewById(R.id.orange6);
                    o6.animate().translationYBy(2000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }
    public void click7(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[2][0] = 1;
                ImageView o7 = (ImageView) findViewById(R.id.orange7);
                o7.animate().translationYBy(3000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[2][0] = 2;
                ImageView b7=findViewById(R.id.blue7);
                b7.animate().translationYBy(3000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[2][0]==0){
                if(f==false)
                {
                    mat[2][0]=2;
                    ImageView b7=findViewById(R.id.blue7);
                    b7.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[2][0]=1;
                    ImageView o7 = (ImageView) findViewById(R.id.orange7);
                    o7.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }
    public void click8(View view) {
        if (countmov == 0) {
            Random rand = new Random();
            int n = rand.nextInt(2);
            if (n == 0) {
                mat[2][1] =1;
                ImageView o8 = (ImageView) findViewById(R.id.orange8);
                o8.animate().translationYBy(3000f).setDuration(2000);
                countmov++;

            }
            if (n == 1) {
                mat[2][1] = 2;
                ImageView b8 = findViewById(R.id.blue8);
                b8.animate().translationYBy(3000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[2][1]==0){
                if(f==false)
                {
                    mat[2][1]=2;
                    ImageView b8=findViewById(R.id.blue8);
                    b8.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[2][1]=1;
                    ImageView o8 = (ImageView) findViewById(R.id.orange8);
                    o8.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }
    public void click9(View view){
        if(countmov==0){
            Random rand = new Random();
            int  n = rand.nextInt(2);
            if(n==0) {
                mat[2][2] = 1;
                ImageView o9 = (ImageView) findViewById(R.id.orange9);
                o9.animate().translationYBy(3000f).setDuration(2000);
                countmov++;

            }
            if(n==1){
                mat[2][2] = 2;
                ImageView b9=findViewById(R.id.blue9);
                b9.animate().translationYBy(3000f).setDuration(2000);
                countmov++;
                f=true;

            }
        }
        else {
            if(mat[2][2]==0){
                if(f==false)
                {
                    mat[2][2]=2;
                    ImageView b9=findViewById(R.id.blue9);
                    b9.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=true;
                }
                else{
                    mat[2][2]=1;
                    ImageView o9 = (ImageView) findViewById(R.id.orange9);
                    o9.animate().translationYBy(3000f).setDuration(2000);
                    countmov++;
                    f=false;
                }
            }
            checkGameStatus();

        }
    }

    private void checkGameStatus() {

        if(mat[0][0]==2&&mat[0][1]==2&&mat[0][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[0][0]==1&&mat[0][1]==1&&mat[0][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }

        if(mat[1][0]==2&&mat[1][1]==2&&mat[1][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[1][0]==1&&mat[1][1]==1&&mat[1][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }
        if(mat[2][0]==2&&mat[2][1]==2&&mat[2][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[2][0]==1&&mat[2][1]==1&&mat[2][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);

        }
        if(mat[0][0]==2&&mat[1][0]==2&&mat[2][0]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[0][0]==1&&mat[1][0]==1&&mat[2][0]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }
        if(mat[0][1]==2&&mat[1][1]==2&&mat[2][1]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[0][1]==1&&mat[1][1]==1&&mat[2][1]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }
        if(mat[0][2]==2&&mat[1][2]==2&&mat[2][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[0][2]==1&&mat[1][2]==1&&mat[2][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }

        if(mat[0][0]==2&&mat[1][1]==2&&mat[2][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[0][0]==1&&mat[1][1]==1&&mat[2][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }
        if(mat[2][0]==2&&mat[1][1]==2&&mat[0][2]==2){
            TextView bw=findViewById(R.id.bluewon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }


        if(mat[2][0]==1&&mat[1][1]==1&&mat[0][2]==1){
            TextView bw=findViewById(R.id.orwon);
            Button b=findViewById(R.id.rematch);
            bw.animate().translationY(0).setDuration(2300);
            b.animate().translationY(0).setDuration(2400);
            w=true;
            Button btn = (Button) findViewById(R.id.button);
            btn.setEnabled(false);
            Button btn2 = (Button) findViewById(R.id.button2);
            btn2.setEnabled(false);
            Button btn3 = (Button) findViewById(R.id.button3);
            btn3.setEnabled(false);
            Button btn4 = (Button) findViewById(R.id.button4);
            btn4.setEnabled(false);
            Button btn5 = (Button) findViewById(R.id.button5);
            btn5.setEnabled(false);
            Button btn6 = (Button) findViewById(R.id.button6);
            btn6.setEnabled(false);
            Button btn7 = (Button) findViewById(R.id.button7);
            btn7.setEnabled(false);
            Button btn8 = (Button) findViewById(R.id.button8);
            btn8.setEnabled(false);
            Button btn9 = (Button) findViewById(R.id.button9);
            btn9.setEnabled(false);
        }
        if(countmov==9&&!w){
        TextView dr=findViewById(R.id.draw);
            Button bdr=findViewById(R.id.rematch);
            dr.animate().translationY(0).setDuration(2300);
            bdr.animate().translationY(0).setDuration(2400);
        }

   }

    public void restart(View view){
        recreate();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView b1=(ImageView)findViewById(R.id.blue1);
        b1.setTranslationY(-1000f);
        ImageView o1=(ImageView)findViewById(R.id.orange1);
        o1.setTranslationY(-1000f);
        ImageView b2=(ImageView)findViewById(R.id.blue2);
        b2.setTranslationY(-1000f);
        ImageView o2=(ImageView)findViewById(R.id.orange2);
        o2.setTranslationY(-1000f);
        ImageView b3=(ImageView)findViewById(R.id.blue3);
        b3.setTranslationY(-1000f);
        ImageView o3=(ImageView)findViewById(R.id.orange3);
        o3.setTranslationY(-1000f);
        ImageView b4=(ImageView)findViewById(R.id.blue4);
        b4.setTranslationY(-2000f);
        ImageView o4=(ImageView)findViewById(R.id.orange4);
        o4.setTranslationY(-2000f);
        ImageView b5=(ImageView)findViewById(R.id.blue5);
        b5.setTranslationY(-2000f);
        ImageView o5=(ImageView)findViewById(R.id.orange5);
        o5.setTranslationY(-2000f);
        ImageView b6=(ImageView)findViewById(R.id.blue6);
        b6.setTranslationY(-2000f);
        ImageView o6=(ImageView)findViewById(R.id.orange6);
        o6.setTranslationY(-2000f);
        ImageView b7=(ImageView)findViewById(R.id.blue7);
        b7.setTranslationY(-3000f);
        ImageView o7=(ImageView)findViewById(R.id.orange7);
        o7.setTranslationY(-3000f);
        ImageView b8=(ImageView)findViewById(R.id.blue8);
        b8.setTranslationY(-3000f);
        ImageView o8=(ImageView)findViewById(R.id.orange8);
        o8.setTranslationY(-3000f);
        ImageView b9=(ImageView)findViewById(R.id.blue9);
        b9.setTranslationY(-3000f);
        ImageView o9=(ImageView)findViewById(R.id.orange9);
        o9.setTranslationY(-3000f);
        TextView rw=findViewById(R.id.orwon);
        rw.setTranslationY(-3000f);


        TextView bw=findViewById(R.id.bluewon);
        bw.setTranslationY(-3000f);


        TextView dr=findViewById(R.id.draw);
        dr.setTranslationY(-3000f);
        Button rem=findViewById(R.id.rematch);
        rem.setTranslationY(-1000f);
    }
}
