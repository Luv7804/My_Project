package com.example.my_project;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class MainActivity2 extends AppCompatActivity {
    TextView check2,name,enno;
    Button move;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        check2 = findViewById(R.id.textView);
        name = findViewById(R.id.name);
        move = findViewById(R.id.move);

        move.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                Animation ani = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                name.startAnimation(ani);
//                name.startAnimation(animate);

            }
        });

        Intent fromact = getIntent();
        String myName = fromact.getStringExtra("name");
        int enNumber =fromact.getIntExtra("enno",0);
//        int en = fromact.getIntExtra("enno",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                name.setText(myName+"="+enNumber);

//                enno.setText(en);


            }
        },2000);


        check2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "TicTacToe", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

        }
    }