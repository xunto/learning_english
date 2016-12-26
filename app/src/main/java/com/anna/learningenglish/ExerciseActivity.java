package com.anna.learningenglish;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anna.learningenglish.components.AnswerInputLayout;
import com.anna.learningenglish.components.ProgressView;
import com.anna.learningenglish.irregular_verbs.IrregularVerb;
import com.anna.learningenglish.irregular_verbs.IrregularVerbExercise;

public class ExerciseActivity extends AppCompatActivity {
    private ProgressView progress;

    private TextView exampleTextView;

    private AnswerInputLayout firstFormEditText;
    private AnswerInputLayout secondFormEditText;
    private AnswerInputLayout thirdFormEditText;

    private Button checkAnswerButton;
    private Button nextQuestionButton;

    private IrregularVerbExercise exercise;

    public void checkAnswerField(AnswerInputLayout answerInputLayout, String answer) {
        if (answerInputLayout.getText().toString().equals(answer))
            answerInputLayout.setCorrectAnswer(answer);
        else
            answerInputLayout.setWrongAnswer(answer);
        answerInputLayout.blockAnswering();
    }

    public void checkAnswers() {
        IrregularVerb answer = exercise.answer(new IrregularVerb(
                this.firstFormEditText.getText().toString(),
                this.secondFormEditText.getText().toString(),
                this.thirdFormEditText.getText().toString()
        ));

        this.checkAnswerField(firstFormEditText, answer.getFirstForm());
        this.checkAnswerField(secondFormEditText, answer.getSecondForm());
        this.checkAnswerField(thirdFormEditText, answer.getThirdForm());

        if (!exercise.hasNext())
            this.nextQuestionButton.setText(R.string.complete);
        else
            this.nextQuestionButton.setText(R.string.next);

        this.nextQuestionButton.setVisibility(View.VISIBLE);
        this.checkAnswerButton.setVisibility(View.GONE);
    }

    public void updateAnswerField(AnswerInputLayout answerInputLayout, String text) {
        answerInputLayout.clearAnswerCheck();

        answerInputLayout.setText(text);
        if (!text.equals(""))
            answerInputLayout.blockAnswering();
        else
            answerInputLayout.unblockAnswering();
    }

    public void nextQuestion() {
        IrregularVerb verb = exercise.next();


        this.updateAnswerField(firstFormEditText, verb.getFirstForm());
        this.updateAnswerField(secondFormEditText, verb.getSecondForm());
        this.updateAnswerField(thirdFormEditText, verb.getThirdForm());

        exampleTextView.setText(verb.getExample());

        progress.setCurrent(exercise.getCurrent());
        progress.setSize(exercise.getAmount());

        this.nextQuestionButton.setVisibility(View.GONE);
        this.checkAnswerButton.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.exercise = new IrregularVerbExercise(3);

        this.progress = (ProgressView) this.findViewById(R.id.progressTextView);
        this.exampleTextView = (TextView) this.findViewById(R.id.exampleTextView);

        this.firstFormEditText = (AnswerInputLayout) this.findViewById(R.id.firstFormEditText);
        this.secondFormEditText = (AnswerInputLayout) this.findViewById(R.id.secondFormEditText);
        this.thirdFormEditText = (AnswerInputLayout) this.findViewById(R.id.thirdFormEditText);

        this.nextQuestionButton = (Button) this.findViewById(R.id.nextQuestionButton);
        this.nextQuestionButton.setVisibility(View.GONE);
        this.checkAnswerButton = (Button) this.findViewById(R.id.checkAnswerButton);
        this.checkAnswerButton.setVisibility(View.GONE);

        this.nextQuestion();
    }

    public void finish() {
        SharedPreferences sharedPreference = this.getSharedPreferences(getString(R.string.stats_key), MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreference.edit();

        int total = sharedPreference.getInt("total_answers", 0);
        editor.putInt("total_answers", total + this.exercise.getAnsweredAmount());

        int correct = sharedPreference.getInt("correct_answers", 0);
        editor.putInt("correct_answers", correct + this.exercise.getCorrectAmount());

        editor.apply();

        super.finish();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.checkAnswerButton:
                checkAnswers();
                break;
            case R.id.nextQuestionButton:
                if (exercise.hasNext())
                    nextQuestion();
                else
                    finish();

                break;
        }
    }
}
