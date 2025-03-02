package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etFirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);

        tvAns = findViewById(R.id.tvAns);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue + secondValue;

                tvAns.setText("Ans is = "+ans);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue - secondValue;

                tvAns.setText("Ans is = "+ans);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue * secondValue;

                tvAns.setText("Ans is = "+ans);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstValue , secondValue , ans;

                firstValue = Integer.parseInt(etFirstValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());

                ans = firstValue / secondValue;

                tvAns.setText("Ans is = "+ans);

            }
        });

    }
}