package com.example.facturacionmovil.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.facturacionmovil.entities.Factura;

import java.util.List;

@Dao
public interface iFacturaDao {
    @Query("SELECT * FROM Factura")
    LiveData<List<Factura>> findAll();

    @Insert
    void insert(Factura factura);

    @Update
    void update(Factura factura);

    @Delete
    void delete(Factura factura);

    @Query("SELECT * FROM Factura WHERE id = :id")
    Factura findById(int id);
}
