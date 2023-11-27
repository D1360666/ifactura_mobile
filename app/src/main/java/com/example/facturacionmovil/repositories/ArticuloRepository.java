package com.example.facturacionmovil.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.dao.iArticuloDao;
import com.example.facturacionmovil.database.AppDatabase;
import com.example.facturacionmovil.entities.Articulo;

import java.util.List;

public class ArticuloRepository {
    private iArticuloDao articuloDao;
    private LiveData<List<Articulo>> articulos;

    public ArticuloRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        articuloDao = db.articuloDao();
        articulos = articuloDao.findAll();
    }

    public LiveData<List<Articulo>> getArticulos(){
        return articulos;
    }
    public void insert(Articulo articulo){
        articuloDao.insert(articulo);
    }
}
