package com.example.rahmatridham.projectsunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tanggal, suhuAtas, suhuBawah, status, humidity, press, wind;
    ImageView gambarStatus;

    private String valstatus, valtanggal;
    private int valsuhuAtas, valsuhuBawah, valhumidity, valpresure, valwind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tanggal = (TextView) findViewById(R.id.textViewTanggal);
        suhuAtas = (TextView) findViewById(R.id.derajatAtas);
        suhuBawah = (TextView) findViewById(R.id.derajatBawah);
        status = (TextView) findViewById(R.id.textStatus);
        humidity = (TextView) findViewById(R.id.humidityVal);
        press = (TextView) findViewById(R.id.pressVal);
        wind = (TextView) findViewById(R.id.windVal);
        gambarStatus = (ImageView) findViewById(R.id.imageAwan);

        /*
        ambil data dari halaman utama
         */
        Intent intent = getIntent();
        valstatus = intent.getStringExtra("status");
        valtanggal = intent.getStringExtra("tanggal");
        valsuhuAtas = intent.getIntExtra("suhuatas", -1);
        valsuhuBawah = intent.getIntExtra("suhubawah", -1);
        valhumidity = intent.getIntExtra("humidity", -1);
        valpresure = intent.getIntExtra("pressure", -1);
        valwind = intent.getIntExtra("wind", -1);

        tanggal.setText(valtanggal);
        suhuAtas.setText(valsuhuAtas);
        suhuBawah.setText(valsuhuBawah);
        status.setText(valstatus);
        humidity.setText(valhumidity);
        press.setText(valpresure);
        wind.setText(valwind);

        if (valstatus.equals("Panas")) {
            gambarStatus.setImageResource(R.drawable.logo);
        } else if (valstatus.equals("Dingin")) {

        } else if (valstatus.equals("Berawan")) {

        } else {

        }


    }
}
