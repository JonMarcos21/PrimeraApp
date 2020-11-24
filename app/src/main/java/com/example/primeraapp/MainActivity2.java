package com.example.primeraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.io.File;

public class MainActivity2 extends AppCompatActivity {

    private Button uno;
    private Button dos;
    private Button atras;
    private Button salir;
    private Button valora;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Asignacion de Button
        uno =findViewById(R.id.Primera);
        atras=findViewById(R.id.atras);
        dos=findViewById(R.id.Segunda);


        salir = (Button) findViewById(R.id.salir);
        valora = (Button) findViewById(R.id.btnValora);

        mAuth= FirebaseAuth.getInstance();


    }
    public void valorar(View view) {
        Intent valora = new Intent(MainActivity2.this, rating.class);
        startActivity(valora);
        finish();
    }
    public void pasarClisificacion(View view){

        Intent primera = new Intent(this, MainActivity3.class);
        startActivity(primera);
        finish();

    }
    //ir hacia atras
    public void IrAtras(View view){

        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
        finish();

    }
    //pasar a la activity 5
    public void PasarAsegunda(View view){

        Intent dos = new Intent(this, MainActivity5.class);
        startActivity(dos);
        finish();

    }


    // integracion del menu

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

      /*  int id = item.getItemId();
        if (id == R.id.salir) {
            Toast.makeText(getBaseContext(),"Cerrar sesion ",Toast.LENGTH_SHORT).show();
            mAuth.signOut();
            startActivity(new Intent(MainActivity2.this , MainActivity.class));
            finish();
        }
        if (id == R.id.btnShare){
            ApplicationInfo api = getApplicationContext().getApplicationInfo();
            String apkpath = api.sourceDir;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
            startActivity(Intent.createChooser(intent,"ShareVia"));
        }
        return true;
*/
        switch (item.getItemId()){

            case R.id.salir:
                Toast.makeText(getBaseContext(),"Cerrar sesion ",Toast.LENGTH_SHORT).show();
                mAuth.signOut();
                startActivity(new Intent(MainActivity2.this , MainActivity.class));
                finish();
                break;
            case R.id.btnShare:
                Toast.makeText(getBaseContext(),"Comparte la App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnValora:


        }


        return super.onOptionsItemSelected(item);
    }



    }





