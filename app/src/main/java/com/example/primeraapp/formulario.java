package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class formulario extends AppCompatActivity {

    Button siguient;
    Button btnfoto;
    ImageView foto;
    static final int REQUEST_IMAGE_CAPTURE =100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        siguient=(Button)findViewById(R.id.enviar);
        btnfoto = (Button) findViewById(R.id.añadirfoto);
        foto = (ImageView) findViewById(R.id.foto) ;


        if(ContextCompat.checkSelfPermission(formulario.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(formulario.this, new String[]{
                    Manifest.permission.CAMERA,
            },100);

        }

        siguient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent siguient= new Intent(formulario.this, MainActivity2.class);

                startActivity(siguient);


            }
        });


    }
    public void llamar(View v)
    {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

            startActivityForResult(takePictureIntent, 100);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 ) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            foto.setImageBitmap(imageBitmap);

        }

    }

}