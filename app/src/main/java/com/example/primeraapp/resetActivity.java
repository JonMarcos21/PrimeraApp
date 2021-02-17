package com.example.primeraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class resetActivity extends AppCompatActivity {

    private EditText mcorreo;
    private Button mReset;

    private String email="";
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        mcorreo = (EditText) findViewById(R.id.correo);
        mReset = (Button) findViewById(R.id.reset);

        mAuth= FirebaseAuth.getInstance();



        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email= mcorreo.getText().toString();
                if (!email.isEmpty()) {

                    resetPassword();
                }
                else{
                    Toast.makeText(resetActivity.this, "Ingrese el Email asociado a su cuenta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void resetPassword(){
       
        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){

                    Toast.makeText(resetActivity.this, "Se ha enviado un correo para restablecer tu contraseña", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(resetActivity.this, "No se pudo enviar el correo", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

}