package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mInfTextView;
    private Button mCounterButton; private int mCount;
    private Button cloudCounterButton; private int mCount1;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfTextView = findViewById(R.id.textView);
        mCounterButton = findViewById(R.id.button2);
        button = findViewById(R.id.button);
        cloudCounterButton = findViewById(R.id.button3);
        mCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfTextView.setText("i can see " + ++mCount + " cat");
            }
        });
        cloudCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfTextView.setText("i can see " + ++mCount1 + " clouds");
            }
        });
    }

    public void onClick(View view) {
        mInfTextView.setText("hello cat");
    }

}