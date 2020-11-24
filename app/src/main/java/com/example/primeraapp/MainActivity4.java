package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button atras;
    Button jornada8;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        atras = findViewById(R.id.button);
        jornada8 = (Button) findViewById(R.id.jornada8);

        jornada8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jornada8 = new Intent(MainActivity4.this, jornada8laliga.class);
                startActivity(jornada8);
                finish();

            }
        });
    }

        public void IrAtras(View view){

            Intent atras = new Intent(this, MainActivity3.class);
            startActivity(atras);
            finish();


    }
}