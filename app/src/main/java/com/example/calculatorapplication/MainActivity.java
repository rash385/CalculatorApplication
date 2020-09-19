package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Integer> numberIds = Arrays.asList(
            R.id.nine,
            R.id.eight,
            R.id.seven,
            R.id.six,
            R.id.five,
            R.id.four,
            R.id.three,
            R.id.two,
            R.id.one,
            R.id.zero);
    private List<Integer> operationsIds = Arrays.asList(
            R.id.minus,
            R.id.plus,
            R.id.sign,
            R.id.div,
            R.id.equals,
            R.id.multiply
    );
    private View.OnClickListener onNumberClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    private View.OnClickListener onOperationClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            numberIds.forEach(numberId -> {
                findViewById(numberId).setOnClickListener(onNumberClickListener);
            });
            operationsIds.forEach(operationId ->{
                findViewById(operationId).setOnClickListener(onOperationClickListener);
            });
        }

    }
}