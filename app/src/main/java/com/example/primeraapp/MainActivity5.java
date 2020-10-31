package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private Button siguiente;
    private Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        siguiente =findViewById(R.id.resultados);
        atras=findViewById(R.id.button2);

    }
    public void pasarResultados(View view){

        Intent resultados = new Intent(this, MainActivity6.class);
        startActivity(resultados);
        finish();

    }
    public void setAtras(View view){

        Intent atras = new Intent(this, MainActivity2.class);
        startActivity(atras);
        finish();

    }

}