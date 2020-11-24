package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jornada10segunda extends AppCompatActivity {

    Button jornada9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jornada10segunda);

        jornada9 = (Button) findViewById(R.id.jornada9);

        jornada9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent jornada9 = new Intent(jornada10segunda.this, MainActivity6.class);
                startActivity(jornada9);
                finish();
            }
        });
    }
}