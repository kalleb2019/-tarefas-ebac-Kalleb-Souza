package br.com.souza.domain;

import br.com.souza.dao.CarroDao;
import br.com.souza.dao.ICarroDao;
import br.com.souza.dao.IMarcaDao;
import br.com.souza.dao.MarcaDao;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {
    private ICarroDao carroDao;
    private IMarcaDao marcaDao;

    public CarroTest(){
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
    }

    @Test
    public void inserirCarro(){
        Marca marca = criar("Av1");

        List<Carro> c = new ArrayList<Carro>();
        Carro audiA3 = new Carro();
        audiA3.setNome("Audi A3");
        audiA3.setCor("Preto");
        audiA3.setMarca(marca);
        audiA3.setPreco(60.000);

        Carro audiA4 = new Carro();
        audiA4.setNome("Audi A4");
        audiA4.setCor("Preto");
        audiA4.setMarca(marca);
        audiA4.setPreco(70.000);

        Carro audiA5 = new Carro();
        audiA5.setNome("Audi A5");
        audiA5.setCor("Preto");
        audiA5.setMarca(marca);
        audiA5.setPreco(90.000);

        Carro audiA7 = new Carro();
        audiA7.setNome("Audi A7");
        audiA7.setCor("Braco");
        audiA7.setMarca(marca);
        audiA7.setPreco(900.000);

        c.add(audiA3);
        c.add(audiA4);
        c.add(audiA5);
        c.add(audiA7);

        c.forEach(i -> {Carro test = carroDao.Cadastrar(i);
            Assert.assertNotNull(test.getId());
        });

    }

    private Marca criar(String cod) {
        Marca marca = new Marca();
        marca.setNome("Audi");
        marca.setCodigo(cod);
        return marcaDao.cadastrar(marca);
    }
}
