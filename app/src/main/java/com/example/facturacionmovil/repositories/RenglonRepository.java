package com.example.facturacionmovil.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.dao.iRenglonDao;
import com.example.facturacionmovil.database.AppDatabase;
import com.example.facturacionmovil.entities.Renglon;

import java.util.List;

public class RenglonRepository {
    private iRenglonDao renglonDao;
    private LiveData<List<Renglon>>renglones;

    public RenglonRepository(Application application){
        AppDatabase db = AppDatabase.getInstance(application);
        renglonDao = db.renglonDao();
        renglones = renglonDao.findAll();
    }

    public LiveData<List<Renglon>> getRenglones(){return renglones;}
    public void insert(Renglon renglon){renglonDao.insert(renglon);}
}
