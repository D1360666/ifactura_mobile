package com.example.facturacionmovil;

import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.facturacionmovil.dao.iArticuloDao;
import com.example.facturacionmovil.database.AppDatabase;
import com.example.facturacionmovil.entities.Articulo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ArticuloTest {
    private iArticuloDao articuloDao;
    private AppDatabase appDatabase;

    @Before
    public void createDb(){
        Context context = ApplicationProvider.getApplicationContext();
        appDatabase = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        articuloDao = appDatabase.articuloDao();
    }

    @After
    public void closeDb(){
        appDatabase.close();
    }

    @Test
    public void findByDescripcionTest() throws Exception{
        Articulo articulo = new Articulo();
        articulo.setId(1);
        articulo.setDescripcion("Torta");
        articulo.setPrecio(25);
        articulo.setStock(60);

        articuloDao.insert(articulo);
        Articulo encontrado = articuloDao.findByDescripcion("Torta");

        assertTrue("No se encontro el artículo", articulo.getId()==encontrado.getId());
    }
}
