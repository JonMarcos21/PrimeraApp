package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button atras;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        atras = findViewById(R.id.button);
    }

    public void IrAtras(View view){

        Intent atras = new Intent(this, MainActivity5.class);
        startActivity(atras);
        finish();


    }
}