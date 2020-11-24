package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class rating extends AppCompatActivity {

    Button button;
    RatingBar ratingStars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        button=findViewById(R.id.button3);
        ratingStars=findViewById(R.id.ratingBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent atras = new Intent(rating.this, MainActivity2.class);
                startActivity(atras);



            }
        });



    }

}