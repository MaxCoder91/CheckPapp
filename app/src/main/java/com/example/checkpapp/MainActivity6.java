package com.example.checkpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity6 extends AppCompatActivity {

    private EditText edtTitulo, edtFecha, edtHoraIni, edtHoraFin, edtDesc, edtAlarma;
    private Button btnAgendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        edtTitulo = (EditText) findViewById(R.id.editTextTextPersonName11);
        edtFecha = (EditText) findViewById(R.id.editTextDate3);
        edtHoraIni = (EditText) findViewById(R.id.editTextTextPersonName12);
        edtHoraFin = (EditText) findViewById(R.id.editTextTextPersonName13);
        edtDesc = (EditText) findViewById(R.id.editTextTextMultiLine3);
        edtAlarma = (EditText) findViewById(R.id.editTextTextPersonName14);
        btnAgendar = (Button) findViewById(R.id.button10);

        edtFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturarFecha();
            }
        });
        edtHoraIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturarHoraIni();
            }
        });
        edtHoraFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturarHoraFin();
            }
        });
        btnAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agendarEvento();
            }
        });
    }

    public void capturarFecha(){
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y1, int m1, int d1) {
                String fdia, fmes;

                if(d1<10){
                    fdia = "0"+d1;
                }else{
                    fdia = String.valueOf(d1);
                }
                if((m1+1)<10){
                    fmes = "0"+(m1+1);
                }else{
                    fmes = String.valueOf(m1);
                }
                String fecha = fdia+"-"+fmes+"-"+y1;
                edtFecha.setText(fecha);
            }
        },year,month,day);
        dpDialog.show();

    }

    public void capturarHoraIni(){
        final Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);

        TimePickerDialog tpDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                String fhora, fmin;

                if(hourOfDay<10){
                    fhora = "0"+hourOfDay;
                }else{
                    fhora = String.valueOf(hourOfDay);
                }
                if(minutes<10){
                    fmin = "0"+minutes;
                }else{
                    fmin = String.valueOf(minutes);
                }
                String hora=fhora+":"+fmin;
                edtHoraIni.setText(hora);
            }
        },hora,minutos,false);
        tpDialog.show();
    }
    public void capturarHoraFin(){
        final Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);

        TimePickerDialog tpDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                String fhora, fmin;

                if(hourOfDay<10){
                    fhora = "0"+hourOfDay;
                }else{
                    fhora = String.valueOf(hourOfDay);
                }
                if(minutes<10){
                    fmin = "0"+minutes;
                }else{
                    fmin = String.valueOf(minutes);
                }
                String hora=fhora+":"+fmin;
                edtHoraFin.setText(hora);
            }
        },hora,minutos,false);
        tpDialog.show();
    }
    public void agendarEvento(){
        String titulo, fecha, horaIni, horaFin, desc, alarma;
        titulo = edtTitulo.getText().toString();
        fecha = edtFecha.getText().toString();
        horaIni = edtHoraIni.getText().toString();
        horaFin = edtHoraFin.getText().toString();
        desc = edtDesc.getText().toString();
        alarma = edtAlarma.getText().toString();

        Toast.makeText(this, "Título: "+titulo+" \nFecha: "+fecha+" \nHora de Inicio: "+horaIni+
                " \nHora de Término: "+horaFin+" \nDescripción: "+desc+" \nAlarma: "+alarma, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}