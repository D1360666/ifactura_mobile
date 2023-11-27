package com.example.facturacionmovil.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.facturacionmovil.entities.Articulo;
import com.example.facturacionmovil.entities.Factura;

import java.util.List;

@Dao
public interface iArticuloDao {
    @Query("SELECT * FROM Articulo")
    LiveData<List<Articulo>> findAll();

    @Insert
    void insert(Articulo articulo);

    @Update
    void update(Articulo articulo);

    @Delete
    void delete(Articulo articulo);

    @Query("SELECT * FROM Articulo WHERE id = :id")
    Articulo findById(int id);

    @Query("SELECT * FROM Articulo WHERE descripcion like :descripcion")
    Articulo findByDescripcion(String descripcion);
}
