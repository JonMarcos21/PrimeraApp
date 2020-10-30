package com.example.primeraapp.ui;

public class Clasificacion {
    private int posicion;
    private int puntos;
    private Integer equipoImage;
    private String nombre;

    public Clasificacion( int posicion, int puntos, Integer equipoImage , String nombre) {
        this.posicion = posicion;
        this.puntos = puntos;
        this.equipoImage = equipoImage;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntosDate) {
        this.puntos = puntosDate;
    }

    public Integer getEquipoImage() {
        return equipoImage;
    }

    public void setEquipoImage(Integer equipoImage) {
        this.equipoImage = equipoImage;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
