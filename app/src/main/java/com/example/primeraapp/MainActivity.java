package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       siguiente =(Button)findViewById(R.id.Acceder);

       siguiente.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent siguiente = new Intent(MainActivity.this, MainActivity2.class);

               startActivity(siguiente);

           }
       });

        Button formulario;

        formulario =(Button)findViewById(R.id.registro);

        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent formulario = new Intent(MainActivity.this,formulario.class);

                startActivity(formulario);

            }
        });
    }
}

