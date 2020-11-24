package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jornada8laliga extends AppCompatActivity {

    Button jornada7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jornada8laliga);
        jornada7 = (Button)findViewById(R.id.jornada7);

        jornada7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jornada7 = new Intent(jornada8laliga.this, MainActivity4.class);

                startActivity(jornada7);
                finish();
            }
        });
    }

}
