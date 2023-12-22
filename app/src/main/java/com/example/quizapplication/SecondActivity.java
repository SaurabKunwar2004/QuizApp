package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button one, two,three;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historylay);
         one=findViewById(R.id.Hbasic);
         one.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent oo=new Intent(SecondActivity.this,HistoryActivity.class);
                 startActivity(oo);
             }
         });

         two=findViewById(R.id.Hadv);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oo=new Intent(SecondActivity.this,HistoryAdvance.class);
                startActivity(oo);
            }
        });
        three=findViewById(R.id.BackbtnH);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w=new Intent(SecondActivity.this,WelcomeActivity.class);
                startActivity(w);
            }
        });

    }
}
