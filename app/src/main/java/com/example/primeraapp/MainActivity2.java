package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button uno;
    private Button dos;
    private Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Asignacion de Button
        uno =findViewById(R.id.Primera);
        atras=findViewById(R.id.atras);
        dos=findViewById(R.id.Segunda);
    }

    public void pasarClisificacion(View view){

        Intent primera = new Intent(this, MainActivity3.class);
        startActivity(primera);
        finish();

    }
    public void IrAtras(View view){

        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
        finish();

    }
    public void PasarAsegunda(View view){

        Intent dos = new Intent(this, MainActivity5.class);
        startActivity(dos);
        finish();

    }
    }





