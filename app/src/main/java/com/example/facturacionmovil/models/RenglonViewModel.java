package com.example.facturacionmovil.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.entities.Renglon;
import com.example.facturacionmovil.repositories.RenglonRepository;

import java.util.List;

public class RenglonViewModel extends AndroidViewModel {
    private RenglonRepository renglonRepository;
    private final LiveData<List<Renglon>> renglones;

    public RenglonViewModel(@NonNull Application application){
        super(application);
        renglonRepository = new RenglonRepository(application);
        renglones = renglonRepository.getRenglones();
    }
}
