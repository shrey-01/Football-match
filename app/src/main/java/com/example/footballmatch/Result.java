package com.example.footballmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResults = findViewById(R.id.tvResults);
            setValue();


    }

    private void setValue() {
        if(getIntent().getStringExtra("count1")==null)
        {
            if(getIntent().getStringExtra("count2")==null)
            {
                String winner=getIntent().getStringExtra("final");
                tvResults.setText(winner);

            }
            else
            {
                String winner=getIntent().getStringExtra("count2");
                tvResults.setText(winner);
            }


        }
        else{
           String winner= getIntent().getStringExtra("count1");
           tvResults.setText(winner);
        }
    }
}