package com.example.primeraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //boton para acceder sin registrarse
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
               finish();

           }
       });

       //boton para aacceder al formulario
        Button formulario;

        formulario =(Button)findViewById(R.id.registro);

        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent formulario = new Intent(MainActivity.this,formulario.class);

                startActivity(formulario);
                finish();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Integracion del menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.info:
                Toast.makeText(getBaseContext(),"informacion",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnShare:
                Toast.makeText(getBaseContext(),"Comparte la App",Toast.LENGTH_SHORT).show();
                break;
                case R.id.btnValora:
                Toast.makeText(getBaseContext(),"Valora la App",Toast.LENGTH_SHORT).show();
                break;

        }


        return super.onOptionsItemSelected(item);
    }


}

