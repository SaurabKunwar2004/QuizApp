package com.example.quizapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SportBasic extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionstextview;
    TextView  questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitBtn;

    int score= 0;
    int totalQuestion = SportBasicQuestion.SBQuestions.length;
    int currentQuestionIndex= 0;
    String selectedAnswer= "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sportbasic);

        totalQuestionstextview= findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA= findViewById(R.id.SportA);
        ansB= findViewById(R.id.SportB);
        ansC= findViewById(R.id.SportC);
        ansD= findViewById(R.id.SportD);
        submitBtn=findViewById(R.id.SportSUBMIT);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionstextview.setText("Total question : "+totalQuestion);

        loadNewQuestion();


    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(getResources().getColor(android.R.color.white));
        ansB.setBackgroundColor(getResources().getColor(android.R.color.white));
        ansC.setBackgroundColor(getResources().getColor(android.R.color.white));
        ansD.setBackgroundColor(getResources().getColor(android.R.color.white));

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.SportSUBMIT) {
            if (selectedAnswer.equals(SportBasicQuestion.SBCorrectAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        }else{
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
        }

    }

    void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }
        questionTextView.setText(SportBasicQuestion.SBQuestions[currentQuestionIndex]);
        ansA.setText(SportBasicQuestion.SBChoices[currentQuestionIndex][0]);
        ansB.setText(SportBasicQuestion.SBChoices[currentQuestionIndex][1]);
        ansC.setText(SportBasicQuestion.SBChoices[currentQuestionIndex][2]);
        ansD.setText(SportBasicQuestion.SBChoices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus= "";
        if(score > totalQuestion*0.60){
            passStatus="Passed";
        }else{
            passStatus="Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+score+" out of  "+totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .setNegativeButton("Home", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent a=new Intent(SportBasic.this,FifthActivity.class);
                        startActivity(a);
                    }
                })
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex=0;
        loadNewQuestion();
    }
}

