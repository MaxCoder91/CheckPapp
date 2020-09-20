package com.example.checkpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private EditText edtNombre, edtApellido, edtEmail, edtPass, edtRePass;
    private Button btnCrearCta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edtNombre = (EditText) findViewById(R.id.editTextTextPersonName5);
        edtApellido = (EditText) findViewById(R.id.editTextTextPersonName6);
        edtEmail = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        edtPass = (EditText) findViewById(R.id.editTextTextPassword2);
        edtRePass = (EditText) findViewById(R.id.editTextTextPassword3);
        btnCrearCta = (Button) findViewById(R.id.button8);

        btnCrearCta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearCta();
            }
        });

    }
    public void crearCta(){
        String nombre,apellido,mail,pass,repass;

        if(edtNombre.getText().toString().trim().equalsIgnoreCase(" ")){
            edtNombre.setError("Debe ingresar su nombre");
        }else if(edtApellido.getText().toString().trim().equalsIgnoreCase(" ")){
            edtApellido.setError("Debe ingresar su apellido");
        }else if(edtEmail.getText().toString().trim().equalsIgnoreCase(" ")){
            edtEmail.setError("Debe ingresar un correo");
        }else if(edtPass.getText().toString().trim().equalsIgnoreCase(" ")){
            edtPass.setError("Debe ingresar una contraseña");
        }else if(edtRePass.getText().toString().trim().equalsIgnoreCase(" ")){
            edtPass.setError("Debe ingresar una contraseña");
        //else if(edtPass.getText().toString()!=edtRePass.getText().toString()){
        //    edtRePass.setError("La contraseña debe coincidir");
        }else{
            nombre = edtNombre.getText().toString();
            apellido = edtApellido.getText().toString();
            mail = edtEmail.getText().toString();
            pass = edtPass.getText().toString();

            Toast.makeText(this, "CUENTA REGISTRADA CON EXITO"+"\nUsuario: "+nombre+" "+apellido+
                    "\nCorreo: "+mail+" \nContraseña: "+pass, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}