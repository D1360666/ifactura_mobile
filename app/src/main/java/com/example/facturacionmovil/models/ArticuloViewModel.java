package com.example.facturacionmovil.models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.facturacionmovil.entities.Articulo;
import com.example.facturacionmovil.repositories.ArticuloRepository;

import java.util.List;

public class ArticuloViewModel extends AndroidViewModel {
    private ArticuloRepository articuloRepository;
    private final LiveData<List<Articulo>> articulos;

    public ArticuloViewModel(@NonNull Application application){
        super(application);
        articuloRepository = new ArticuloRepository(application);
        articulos = articuloRepository.getArticulos();
    }
}
