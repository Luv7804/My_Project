package com.example.my_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    TextView emailId;
    TextView password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        emailId = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Intent iNext = getIntent();
        String name = iNext.getStringExtra("email");
        String pass = iNext.getStringExtra("password");
        emailId.setText(name);
        password.setText(pass);
    }
}