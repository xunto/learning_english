package com.anna.learningenglish;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textView = (TextView) findViewById(R.id.percentTextView);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreference = this.getSharedPreferences(getString(R.string.stats_key), MODE_PRIVATE);
        int total_answers = sharedPreference.getInt("total_answers", -1);
        int correct_answers = sharedPreference.getInt("correct_answers", 0);

        int percents = (int) ((correct_answers * 100.0f) / total_answers);
        textView.setText(percents + "%");

    }

    public void onClick(View v) {
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }
}
