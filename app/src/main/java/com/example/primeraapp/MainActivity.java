package com.example.primeraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class MainActivity extends AppCompatActivity {


    Button siguiente;

    private EditText mcontraseña;
    private EditText mcorreo;

    private Button login;

    private String email = "";
    private String password = "";

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       siguiente =(Button)findViewById(R.id.Acceder);

        mcontraseña = (EditText) findViewById(R.id.editTextTextPassword);
        mcorreo = (EditText) findViewById(R.id.editTextTextPersonName);
        login = (Button) findViewById(R.id.login);
        mAuth=FirebaseAuth.getInstance();




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = mcorreo.getText().toString();
                password = mcontraseña.getText().toString();

                if(!email.isEmpty() && !password.isEmpty()){

                    loginuser();
                }
                else{
                    Toast.makeText(MainActivity.this, "Completa los campos", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //boton para acceder sin registrarse
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
    //creacion metodo login
    private void loginuser(){

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));

                }
                else {
                    Toast.makeText(MainActivity.this, "No se pudo iniciar sesion, compruebe los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }








}

