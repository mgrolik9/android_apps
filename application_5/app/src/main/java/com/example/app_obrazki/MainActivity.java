package com.example.app_obrazki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

        ImageView rigth_bottom_image = findViewById(R.id.imageView4);
        rigth_bottom_image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String[] phrases = {"cat","dog",
                        "ball","flower","strawberry"};
                shuffleArray(phrases);
                textView.setText(phrases[0]);
                textView3.setText(phrases[1]);
                textView4.setText(phrases[2]);
            }


        });
    }
    void shuffleArray(String[] arr){
        Random rnd = new Random();
        for (int i =arr.length -1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a  = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}
