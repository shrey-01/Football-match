package com.example.footballmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1,tv2;
    private Button btn1,btn2,btnFinal;
    int count1=0,count2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate");
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btnFinal=findViewById(R.id.btnFinal);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                tv1.setText("score of team 1 is: "+count1);



            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                tv2.setText("score of team 2 is: "+count2);



            }
        });
        btnFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Result.class);
                if(count1>count2){
                    intent.putExtra("count1","Team 1 is winner");
                }
                else if(count1==count2){
                    intent.putExtra("count2","Match is draw");
                }
                else{
                    intent.putExtra("final","Team 2 is winner");
                }
                startActivity(intent);


            }
        });
    }

}

