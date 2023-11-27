package com.example.facturacionmovil.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.facturacionmovil.entities.Factura;
import com.example.facturacionmovil.entities.Renglon;

import java.util.List;

@Dao
public interface iRenglonDao {
    @Query("SELECT * FROM Renglon")
    LiveData<List<Renglon>> findAll();

    @Insert
    void insert(Renglon renglon);

    @Update
    void update(Renglon renglon);

    @Delete
    void delete(Renglon renglon);

    @Query("SELECT * FROM Renglon WHERE id = :id")
    Renglon findById(int id);
}
