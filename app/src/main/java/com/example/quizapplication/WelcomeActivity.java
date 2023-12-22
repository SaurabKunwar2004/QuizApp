package com.example.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
    Button one,two,three,four,five,six;
    Button menu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        one=findViewById(R.id.itquiz);
        two=findViewById(R.id.general);
        three=findViewById(R.id.history);
        four=findViewById(R.id.geography);
        five=findViewById(R.id.sports);
        six=findViewById(R.id.science);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WelcomeActivity.this,FirstActivity.class);
            startActivity(in);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(WelcomeActivity.this,ThirdActivity.class);
                startActivity(in);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(WelcomeActivity.this,SecondActivity.class);
                startActivity(a);

            }
        });
       four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(WelcomeActivity.this,ForthActivity.class);
                startActivity(a);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(WelcomeActivity.this,FifthActivity.class);
                startActivity(a);

            }
        });  six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(WelcomeActivity.this,SixthActivity.class);
                startActivity(a);


            }
        });

                menu=findViewById(R.id.btnidt);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(WelcomeActivity.this, "You just clicked on Menu", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
