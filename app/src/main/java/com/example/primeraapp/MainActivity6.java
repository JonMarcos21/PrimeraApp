package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button atras;
    Button jornada10;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        atras = findViewById(R.id.button);
        jornada10 = (Button) findViewById(R.id.jornada10);

        //acceder jornada 10 segunda
        jornada10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent jornada10s = new Intent(MainActivity6.this, jornada10segunda.class);
                 startActivity(jornada10s);
                 finish();
            }
        });
    }
// boton para ir atras
    public void IrAtras(View view){

        Intent atras = new Intent(this, MainActivity5.class);
        startActivity(atras);
        finish();


    }

}