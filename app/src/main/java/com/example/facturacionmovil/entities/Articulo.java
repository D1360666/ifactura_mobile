package com.example.facturacionmovil.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Articulo {
    @PrimaryKey
    private int id;
    private String descripcion;
    private int precio;
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
