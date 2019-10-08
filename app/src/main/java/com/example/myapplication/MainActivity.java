package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private EditText edWeight;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        findView();

    }
    public void bmi(View view){
        float Weight = Float.parseFloat(edWeight.getText().toString());
        float Height = Float.parseFloat(edHeight.getText().toString());
        float bmi = Weight / ( Height * Height);
        Log.d("MainActivity", "bmi: " + bmi);
    }

    private void findView() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }


}
