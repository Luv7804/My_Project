package com.example.my_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button sign_up;
    EditText email;
    TextView result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sign_up = findViewById(R.id.signup);
        email = findViewById(R.id.email);
        result = findViewById(R.id.result);

        Intent iNext = new Intent(MainActivity2.this, MainActivity4.class);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = email.getText().toString();
                result.setText(emailId);
                iNext.putExtra("name", emailId);
                startActivity(iNext);
            }
        });
    }
    }