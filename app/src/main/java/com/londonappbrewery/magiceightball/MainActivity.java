package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] options = {
                R.drawable.maybe,
                R.drawable.no,
                R.drawable.probably,
                R.drawable.yes
        };
        final ImageView answer = findViewById(R.id.answer);

        Button btnRoll = findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randIntGenerator = new Random();
                int answrNum = randIntGenerator.nextInt(4);
                answer.setImageResource(options[answrNum]);
            }
        });
    }
}
