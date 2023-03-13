package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button,button2,button3,button4,button5;
    private EditText editTextNumber,editTextNumber2;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        textView2=findViewById(R.id.textView2);
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int add=Integer.parseInt(editTextNumber.getText().toString()) + Integer.parseInt(editTextNumber2.getText().toString());
                textView2.setText("Result is " + add);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int subtract=Integer.parseInt(editTextNumber.getText().toString()) - Integer.parseInt(editTextNumber2.getText().toString());
                textView2.setText("Result is " + subtract);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int multiply=Integer.parseInt(editTextNumber.getText().toString()) * Integer.parseInt(editTextNumber2.getText().toString());
                textView2.setText("Result is " + multiply);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int divide=Integer.parseInt(editTextNumber.getText().toString()) / Integer.parseInt(editTextNumber2.getText().toString());
                textView2.setText("Result is " + divide);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int modulus=Integer.parseInt(editTextNumber.getText().toString()) % Integer.parseInt(editTextNumber2.getText().toString());
                textView2.setText("Result is " + modulus);
            }
        });

    }
}