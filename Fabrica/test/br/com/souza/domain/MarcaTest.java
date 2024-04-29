package br.com.souza.domain;

import br.com.souza.dao.IMarcaDao;
import br.com.souza.dao.MarcaDao;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MarcaTest {

    private IMarcaDao marcaDao;

    public MarcaTest(){
        marcaDao = new MarcaDao();
    }

    @Test
    public void inserirMarca(){
        List<Marca> m = new ArrayList<>();
        Marca marca = new Marca();
        marca.setNome("Volkswagen");
        marca.setCodigo("Fv1");
        m.add(marca);
        Marca marca2 = new Marca();
        marca2.setNome("Ford");
        marca2.setCodigo("FK2");
        m.add(marca2);
        Marca marca3 = new Marca();
        marca3.setNome("Toyota");
        marca3.setCodigo("TY3");
        m.add(marca3);
        Marca marca4 = new Marca();
        marca4.setNome("Chevrolet");
        marca4.setCodigo("CH4");
        m.add(marca4);
        Marca marca5 = new Marca();
        marca5.setNome("BMW");
        marca5.setCodigo("BM5");
        m.add(marca5);

        m.forEach(i -> { Marca test = marcaDao.cadastrar(i);
            Assert.assertEquals(i.getCodigo(),test.getCodigo());
            Assert.assertNotNull(test.getId());
        });
    }
}
