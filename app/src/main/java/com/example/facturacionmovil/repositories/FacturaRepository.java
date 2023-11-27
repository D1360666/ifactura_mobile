package com.example.facturacionmovil.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.dao.iFacturaDao;
import com.example.facturacionmovil.database.AppDatabase;
import com.example.facturacionmovil.entities.Factura;

import java.util.List;

public class FacturaRepository {
    private iFacturaDao facturaDao;
    private LiveData<List<Factura>> facturas;

    public FacturaRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        facturaDao = db.facturaDao();
        facturas = facturaDao.findAll();
    }

    public LiveData<List<Factura>> getFacturas(){
        return facturas;
    }

    public void insert(Factura factura){
        facturaDao.insert(factura);
    }
}
