package com.example.rahmatridham.projectsunshine;

/**
 * Created by rahmatridham on 8/18/2017.
 */

public class Cuaca {
    private String status,tanggal;
    private int suhuAtas, suhuBawah, humidity, presure, wind;

    public Cuaca(String status, String tanggal, int suhuAtas, int suhuBawah, int humidity, int presure, int wind) {
        this.status = status;
        this.tanggal = tanggal;
        this.suhuAtas = suhuAtas;
        this.suhuBawah = suhuBawah;
        this.humidity = humidity;
        this.presure = presure;
        this.wind = wind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getSuhuAtas() {
        return suhuAtas;
    }

    public void setSuhuAtas(int suhuAtas) {
        this.suhuAtas = suhuAtas;
    }

    public int getSuhuBawah() {
        return suhuBawah;
    }

    public void setSuhuBawah(int suhuBawah) {
        this.suhuBawah = suhuBawah;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPresure() {
        return presure;
    }

    public void setPresure(int presure) {
        this.presure = presure;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }
}
