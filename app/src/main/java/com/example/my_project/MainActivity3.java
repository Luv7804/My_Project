package com.example.my_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    EditText email, pass;
    Button sign_in;
    TextView sign_up;
    SharedPreferences sharedPreferences;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sign_in = findViewById(R.id.login);
        sign_up = findViewById(R.id.sign_up);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        Intent iNext = new Intent(MainActivity3.this, MainActivity4.class);
        Intent iNext2 = new Intent(MainActivity3.this, MainActivity2.class);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = email.getText().toString();
                String password = pass.getText().toString();
                iNext.putExtra("email", emailId);
                iNext.putExtra("password", password);
                startActivity(iNext);

            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext2);
            }
        });


    }
}