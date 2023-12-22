package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;

public class ForthActivity extends AppCompatActivity {
    Button  one, two, three;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geographylay);
        three=findViewById(R.id.BackbtnGe);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(ForthActivity.this,WelcomeActivity.class);
                startActivity(e);
            }
        });

        one=findViewById(R.id.gebasic);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(ForthActivity.this,GEObasic.class);
                startActivity(e);
            }
        });
        two=findViewById(R.id.geadv);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(ForthActivity.this,GEOadvance.class);
                startActivity(e);
            }
        });

    }
}
