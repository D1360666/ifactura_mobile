package com.example.facturacionmovil.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.facturacionmovil.dao.iArticuloDao;
import com.example.facturacionmovil.dao.iFacturaDao;
import com.example.facturacionmovil.dao.iRenglonDao;
import com.example.facturacionmovil.entities.Articulo;
import com.example.facturacionmovil.entities.Factura;
import com.example.facturacionmovil.entities.Renglon;

@Database(entities = {Articulo.class, Factura.class, Renglon.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract iFacturaDao facturaDao();
    public abstract iArticuloDao articuloDao();
    public abstract iRenglonDao renglonDao();
    private static volatile AppDatabase instance;

    public static AppDatabase getInstance(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "almacen").build();
        }
        return instance;
    }
}
