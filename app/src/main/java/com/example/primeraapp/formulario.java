package com.example.primeraapp;

import androidx.annotation.NonNull;
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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class formulario extends AppCompatActivity {

    //elementos para mandar los datos a firebase authentication

    private EditText mnombre;
    private EditText mcontraseña;
    private EditText mcorreo;


    private String name = "";
    private String password= "";
    private String email = "";



    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    Button siguient;
    Button btnfoto;
    ImageView foto;
    static final int REQUEST_IMAGE_CAPTURE =100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        siguient = (Button) findViewById(R.id.enviar);
        btnfoto = (Button) findViewById(R.id.añadirfoto);
        foto = (ImageView) findViewById(R.id.foto);

        mnombre = (EditText) findViewById(R.id.nombre);
        mcontraseña = (EditText) findViewById(R.id.contraseña);
        mcorreo = (EditText) findViewById(R.id.correo);






        //permisos de la camara

        if(ContextCompat.checkSelfPermission(formulario.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(formulario.this, new String[]{
                    Manifest.permission.CAMERA,
            },100);

        }
        // boton para enviar formuario

        siguient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=mnombre.getText().toString();
                password=mcontraseña.getText().toString();
                email=mcorreo.getText().toString();

                if(!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {

                    if(password.length() >=6){
                        registerUser();
                    }
                    else{
                        Toast.makeText(formulario.this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(formulario.this, "Debe completar los campos obligatorios", Toast.LENGTH_SHORT).show();
                }





            }
        });

      //Boton para activar la camara del dispositivo

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




    //metodo de regitrar usuario

    private void registerUser(){

        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){

                    startActivity(new Intent(formulario.this , MainActivity.class));
                    finish();
                 /*  Map<String, Object>map = new HashMap<>();
                    map.put("name",name);
                    map.put("password",password);
                    map.put("email",email);

                    String id= mAuth.getCurrentUser().getUid();

                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                                startActivity(new Intent(formulario.this , MainActivity.class));
                                finish();
                            }
                            else{
                                Toast.makeText(formulario.this, "No se han podido crear los datos correctamente", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });*/
                }
                else{
                    Toast.makeText(formulario.this, "No se pudo registrar este usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}