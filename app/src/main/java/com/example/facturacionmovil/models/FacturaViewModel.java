package com.example.facturacionmovil.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.entities.Factura;
import com.example.facturacionmovil.repositories.FacturaRepository;

import java.util.List;

public class FacturaViewModel extends AndroidViewModel {
    private FacturaRepository facturaRepository;
    private final LiveData<List<Factura>> facturas;

    public FacturaViewModel(@NonNull Application application){
        super(application);
        facturaRepository = new FacturaRepository(application);
        facturas = facturaRepository.getFacturas();
    }
}
