package com.example.suralumapp;

public class Articulo {
    private String articulo;
    private int cantidad;
    private int precio;

    public Articulo() {

    }

    public Articulo(String articulo, int cantidad, int valor) {
        this.articulo= articulo;
        this.cantidad = cantidad;
        this.precio = valor;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
