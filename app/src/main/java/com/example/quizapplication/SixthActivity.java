package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity {
    Button one,two,three;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science);
        three=findViewById(R.id.BackbtnSci);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(SixthActivity.this,WelcomeActivity.class);
                startActivity(y);
            }
        });

        one=findViewById(R.id.scbasic);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(SixthActivity.this,ScienceBasic.class);
                startActivity(y);
            }
        });

        two=findViewById(R.id.scadv);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(SixthActivity.this,ScienceAdvance.class);
                startActivity(y);
            }
        });


    }
}
