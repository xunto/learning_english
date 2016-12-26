package com.anna.learningenglish.components;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class ProgressView extends AppCompatTextView {
    public static char SEPARATOR = '/';
    public int current = 0;
    public int size = 0;

    public ProgressView(Context context) {
        super(context);
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
        this.update();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        this.update();
    }

    public void update() {
        this.setText(Integer.toString(this.current) + SEPARATOR + Integer.toString(this.size));
    }
}
