package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button one,two,three;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generallay);
        three=findViewById(R.id.BackbtnG);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(ThirdActivity.this,WelcomeActivity.class);
                startActivity(e);
            }
        });
        one=findViewById(R.id.Gbasic);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(ThirdActivity.this,GkBasic.class);
                startActivity(u);
            }
        });
        two=findViewById(R.id.Gadv);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent(ThirdActivity.this,Gkadvance.class);
                startActivity(r);
            }
        });
    }
}
