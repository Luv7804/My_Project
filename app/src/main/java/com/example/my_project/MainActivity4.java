package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnCalculate = findViewById(R.id.btnCalculate);
       btnCalculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               EditText edtweight,edtHeightFt,edtHeightIn;
               Button btnCalculate;
               TextView txtResult;
               edtweight = findViewById(R.id.edtWeight);
               edtHeightFt = findViewById(R.id.edtHeightFt);
               edtHeightIn = findViewById(R.id.edtHeightIn);
               btnCalculate = findViewById(R.id.btnCalculate);
               txtResult = findViewById(R.id.txtResult);

               int wt = Integer.parseInt(edtweight.getText().toString());
               int ft = Integer.parseInt(edtHeightFt.getText().toString());
               int in = Integer.parseInt(edtHeightIn.getText().toString());
                int totalIn  = ft*12 + in;
                double totalCm  = totalIn*2.54;
                double totalM = totalCm/100;
               double bmi = wt/(totalM*totalM);
              if(bmi<18.5) {
                  txtResult.setText("You are Under Weight");
              }else  if(bmi>18.5 && bmi<25){
                  txtResult.setText("You are Healthy");
              }
               else if(bmi>25 && bmi <29.9){
                   txtResult.setText("You are Overweight");
               }
               else{
                   txtResult.setText("You are in Obesity");
              }

           }
       });

    }
}