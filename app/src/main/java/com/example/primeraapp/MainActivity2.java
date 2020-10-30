package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button uno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Asignacion de Button
        uno =findViewById(R.id.Primera);

    }

    public void pasarClisificacion(View view){

        Intent atras = new Intent(this, MainActivity3.class);
        startActivity(atras);
        finish();

    }
}



