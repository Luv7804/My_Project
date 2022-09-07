package com.example.my_project;

import static com.example.my_project.R.id.email;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    TextView emailId;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        emailId = findViewById(email);
        Intent iNext = getIntent();
        String name = iNext.getStringExtra("name");
        emailId.setText(name);
    }
}