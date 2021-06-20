package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    Button randomNumber, totalClick, reset;
    int num = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = (TextView) findViewById(R.id.tvNumber);
        randomNumber = (Button) findViewById(R.id.randNumber);
        totalClick = (Button) findViewById(R.id.totalClick);
        reset = (Button) findViewById(R.id.resetNumb);
    }

    public void getRandomNumber(View view) {
            if (view == randomNumber) {
                num = 1 + (int) ((99 - 1 + 1) * Math.random());
                count++;
                tvNumber.setText("Random number is: " + num);
                randomNumber.setText("Click again to generate a new number ");
                totalClick.setText("Total number of clicks: " + count);
                reset.setVisibility(View.VISIBLE);
            }
        }

     public void reset(View view){
        if (num > 0 && count > 0) {
            num = 0;
            count = 0;
            randomNumber.setText("Click again to generate a new number");
            tvNumber.setText("While the value is missing");
            totalClick.setText("The total number of clicks has been reset");
            reset.setVisibility(View.INVISIBLE);
        }
    }
}
