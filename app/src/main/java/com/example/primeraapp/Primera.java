package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primeraapp.ui.Clasificacion;
import com.example.primeraapp.ui.primera.ClasificacionAdapter;

public class Primera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        RecyclerView recyclerView = findViewById(R.id.Primera);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Clasificacion[] tabla= new Clasificacion[]{
                new Clasificacion(1,14,R.drawable.sociedad, "Real sociedad"),

        };

        ClasificacionAdapter myTablaAdapter = new ClasificacionAdapter(tabla, Primera.this);
        recyclerView.setAdapter(myTablaAdapter);


    }
}