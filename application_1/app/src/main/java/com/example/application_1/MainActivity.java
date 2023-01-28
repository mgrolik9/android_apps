package com.example.application_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView aHelloTextView; private EditText bNameEditText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aHelloTextView = (TextView)findViewById(R.id.textView);
        bNameEditText = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (bNameEditText.getText().length() == 0){
            aHelloTextView.setText("Hello grey cat");
        }else{
            aHelloTextView.setText("Hello " + bNameEditText.getText());
        }
    }
}