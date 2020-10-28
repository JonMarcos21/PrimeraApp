package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class formulario extends AppCompatActivity {

    Button siguient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        siguient=(Button)findViewById(R.id.enviar);

        siguient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent siguient= new Intent(formulario.this, MainActivity2.class);

                startActivity(siguient);

            }
        });

    }
}