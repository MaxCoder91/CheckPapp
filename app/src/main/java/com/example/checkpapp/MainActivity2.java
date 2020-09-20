package com.example.checkpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnAgendarEvento, btnTrabajo, btnEstudios, btnOtros;
    private TextView cerrarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnAgendarEvento = (Button) findViewById(R.id.button3);
        btnTrabajo = (Button) findViewById(R.id.button4);
        btnEstudios = (Button) findViewById(R.id.button5);
        btnOtros = (Button) findViewById(R.id.button6);
        cerrarSesion = (TextView) findViewById(R.id.textView4);

        btnAgendarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agenEvent();
            }
        });
        btnTrabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trabajo();
            }
        });
        btnEstudios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                estudios();
            }
        });
        btnOtros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                otros();
            }
        });
        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });
    }

    public void agenEvent(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void trabajo(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void estudios(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void otros(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void salir(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}