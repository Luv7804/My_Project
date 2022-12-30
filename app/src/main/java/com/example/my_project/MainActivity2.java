package com.example.my_project;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {
    Button sign_up;
    EditText email, pass, repass;
    TextView sign_in;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sign_up = findViewById(R.id.signup);
        sign_in = findViewById(R.id.sign_in);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        repass = findViewById(R.id.repass);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        progressDialog = new ProgressDialog(this);
        Intent iNext = new Intent(MainActivity2.this, MainActivity4.class);
        Intent iNext2 = new Intent(MainActivity2.this, MainActivity3.class);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = email.getText().toString();
                String password = pass.getText().toString();
                String repassword = repass.getText().toString();
//                Store data and show in another activity
//                if (password.equals(repassword)) {
//                    iNext.putExtra("email", emailId);
//                    iNext.putExtra("password", password);
//                    startActivity(iNext);
//                } else {
//                    Toast.makeText(MainActivity2.this, "Password Does not Match !!!" + password + "=" + repassword, Toast.LENGTH_SHORT).show();
//
//                }

//                Store data in database
                PerforAuth();
            }
        });
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext2);
            }
        });
    }

    private void PerforAuth() {
        String emailId = email.getText().toString();
        String password = pass.getText().toString();
        String rePassword = repass.getText().toString();
        if (!emailId.matches(emailPattern)) {
            email.setError("Enter Valid Email Address !");
        } else if (password.isEmpty() || password.length() < 6) {
            pass.setError("Enter Valid Password !");
        } else if (!password.equals(rePassword)) {
            pass.setError("Password not Matched !");

        } else {
            progressDialog.setMessage("Wait Until Registration...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();
            mAuth.createUserWithEmailAndPassword(emailId, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        progressDialog.dismiss();
                        sendUserToNextActivity();
                        Toast.makeText(MainActivity2.this, "Register Successful", Toast.LENGTH_SHORT).show();
                    } else {
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity2.this, "" + task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

    }

    private void sendUserToNextActivity() {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}