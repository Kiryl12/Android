package com.example.android.crossfitexercisedescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner) findViewById(R.id.listSpinerExcercise);
        tx = (TextView) findViewById(R.id.textDescription);
    }

    public void getDecription(View view){
        int position = sp.getSelectedItemPosition();
        String description = getDescriptionExercise(position);
        tx.setText(description);
        tx.setTextSize(15);
    }

    public String getDescriptionExercise(int position){
        String[] st = getResources().getStringArray(R.array.exercise_description);
        return st[position];
    }
}