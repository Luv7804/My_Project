package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    Button check;
    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        lottie = findViewById(R.id.lottie);
//        lottie.setAnimation(R.raw.loader);
//        lottie.playAnimation();
//        lottie.loop(true);

        check =findViewById(R.id.button_check);
        Intent iNext;
        iNext = new Intent(MainActivity.this,MainActivity2.class);
        iNext.putExtra("name","Chintan");
        iNext.putExtra("enno",148);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(iNext);
                Toast.makeText(MainActivity.this, "Textbox", Toast.LENGTH_SHORT).show();


            }
        });
    }
}