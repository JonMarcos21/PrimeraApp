package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {

    Button uno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Asignacion de Button
        uno =findViewById(R.id.Primer);

    }

    public void pasarClisificacion(View view){


        Intent atras = new Intent(this, Primera.class);
        startActivity(atras);
        finish();

    }



    }



