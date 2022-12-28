package com.example.my_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button sign_up;
    EditText email, pass, repass;
    TextView sign_in;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sign_up = findViewById(R.id.signup);
        sign_in = findViewById(R.id.sign_in);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        repass = findViewById(R.id.repass);
        Intent iNext = new Intent(MainActivity2.this, MainActivity4.class);
        Intent iNext2 = new Intent(MainActivity2.this, MainActivity3.class);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = email.getText().toString();
                String password = pass.getText().toString();
                String repassword = repass.getText().toString();
                if (password.equals(repassword)) {
                    iNext.putExtra("email", emailId);
                    iNext.putExtra("password", password);
                    startActivity(iNext);
                } else {
                    Toast.makeText(MainActivity2.this, "Password Does not Match !!!" + password + "=" + repassword, Toast.LENGTH_SHORT).show();

                }
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext2);
            }
        });
    }
    }