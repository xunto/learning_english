package com.anna.learningenglish.components;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;

import com.anna.learningenglish.R;

public class AnswerInputLayout extends TextInputLayout {
    public AnswerInputLayout(Context context) {
        super(context);
    }

    public AnswerInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Editable getText() {
        EditText editText = this.getEditText();
        if (editText != null) {
            return editText.getText();
        }

        return null;
    }

    public void setText(String text) {
        EditText editText = this.getEditText();
        if (editText != null) {
            editText.setText(text);
        }
    }

    public void blockAnswering() {
        EditText editText = this.getEditText();
        if (editText != null) {
            editText.setEnabled(false);
        }
    }

    public void unblockAnswering() {
        EditText editText = this.getEditText();
        if (editText != null) {
            editText.setEnabled(true);
        }
    }

    public void clearAnswerCheck() {
        this.setMessage("");
        this.setErrorEnabled(false);
    }

    private void setMessage(String answer) {
        this.setErrorEnabled(true);
        this.setError(answer);
    }

    public void setCorrectAnswer(String answer) {
        this.setErrorTextAppearance(R.style.correct_answer);
        this.setMessage(answer);
    }

    public void setWrongAnswer(String answer) {
        this.setErrorTextAppearance(R.style.wrong_answer);
        this.setMessage(answer);
    }
}
