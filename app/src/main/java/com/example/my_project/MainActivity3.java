package com.example.my_project;

import static com.example.my_project.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnNewGame,btnNext;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
int flag = 0,count = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main3);
        init();
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Toast.makeText(MainActivity3.this, "BMI Claculator", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity3.this,MainActivity4.class));
                        startActivity(new Intent(MainActivity3.this,MainActivity4.class));
            }
        });
    }
    public void init(){
        btn1 = findViewById(id.btn1);
        btn2 = findViewById(id.btn2);
        btn3 = findViewById(id.btn3);
        btn4 = findViewById(id.btn4);
        btn5 = findViewById(id.btn5);
        btn6 = findViewById(id.btn6);
        btn7 = findViewById(id.btn7);
        btn8 = findViewById(id.btn8);
        btn9 = findViewById(id.btn9);
        btnNewGame = findViewById(id.btnnewGame);
    }
    public void check(View view){
        Button btnCurrent = (Button) view;
        count++;
        if(btnCurrent.getText().toString().equals("")) {


            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    if(b1.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
             reset();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    if(b4.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
            reset();

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    if(b7.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                reset();

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    if(b1.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                    reset();


                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    if(b2.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                reset();

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    if(b3.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                reset();

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    if(b1.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                 reset();

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    if(b3.equals("X")) {
                        Toast.makeText(this, "Player 1 Win", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Player 2 Win ...", Toast.LENGTH_LONG).show();

                    }
                  reset();

                }else if(!b1.equals("")&&!b2.equals("")&&!b3.equals("")&&!b4.equals("")&&!b5.equals("")&&!b6.equals("")&&!b7.equals("")&&!b8.equals("")&&!b9.equals("")){
                    Toast.makeText(this, "Game Draw ...", Toast.LENGTH_LONG).show();
                    reset();
                }
            }

        }

    }

    public void newGame(View view){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag=0;
    }
    public void reset(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag=0;
    }
}