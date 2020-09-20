package com.example.checkpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    private Button btnCrearEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        btnCrearEvento = (Button) findViewById(R.id.button12);

        btnCrearEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearEvento();
            }
        });
    }

    public void crearEvento(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}