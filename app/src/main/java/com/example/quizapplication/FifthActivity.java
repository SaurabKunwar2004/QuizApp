package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {
    Button one,two,three;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportslay);
        three=findViewById(R.id.Backbtnsport);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(FifthActivity.this,WelcomeActivity.class);
                startActivity(t);
            }
        });

        one=findViewById(R.id.Sbasic);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(FifthActivity.this,SportBasic.class);
                startActivity(t);
            }
        });

        two=findViewById(R.id.Sadv);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(FifthActivity.this,SportAdvance.class);
                startActivity(t);
            }
        });

    }
}
