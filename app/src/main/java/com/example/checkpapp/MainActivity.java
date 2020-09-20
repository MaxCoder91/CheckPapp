package com.example.checkpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail, edtPass;
    private Button btnIngresar, btnCrearCta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        edtPass = (EditText) findViewById(R.id.editTextTextPassword);
        btnIngresar = (Button) findViewById(R.id.button);
        btnCrearCta = (Button) findViewById(R.id.button2);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniSesion();
            }
        });

        btnCrearCta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearCta();
            }
        });
    }

    public void iniSesion(){
        String mail,pass;
        if(edtEmail.getText().toString().trim().equalsIgnoreCase(" ")){
            edtEmail.setError("Debe ingresar un correo");
        }else if(edtPass.getText().toString().trim().equalsIgnoreCase(" ")){
            edtPass.setError("Debe ingresar una contraseña");
        }else{
            mail = edtEmail.getText().toString();
            pass = edtPass.getText().toString();

            Toast.makeText(this, "\nUsuario: "+mail+" \nContraseña: "+pass, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

    }
    public void crearCta(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}