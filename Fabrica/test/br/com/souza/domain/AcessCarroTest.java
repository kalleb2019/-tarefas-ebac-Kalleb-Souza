package br.com.souza.domain;

import br.com.souza.dao.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AcessCarroTest {
    private IAcessorioDao acessorioDao;
    private ICarroDao carroDao;
    private IMarcaDao marcaDao;

    public AcessCarroTest(){
        acessorioDao = new AcessorioDao();
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
    }
    @Test
    public void AcessCarro(){
        List<Acessorio> a = criarAcess();
        Carro c = criarCarro();
                c.setAcessorios(a);
                Carro test = carroDao.Cadastrar(c);
                Assert.assertNotNull(test.getId());
                Assert.assertEquals(test.getNome(), c.getNome());

    }

    private List<Acessorio> criarAcess() {
        List<Acessorio> a = new ArrayList<>();
        Acessorio acessorio01 = new Acessorio();
        acessorio01.setNome("Recarga");
        acessorio01.setDescricao("Sistema de recarga rápida para carregamento");
        acessorio01.setPreco(999.99);

        Acessorio acessorio02 = new Acessorio();
        acessorio02.setNome("Navegação");
        acessorio02.setDescricao("Sistema de navegação GPS integrado");
        acessorio02.setPreco(1499.99);

        Acessorio acessorio03 = new Acessorio();
        acessorio03.setNome("Condução");
        acessorio03.setDescricao("Assistência de condução autônoma");
        acessorio03.setPreco(2499.99);

        Acessorio acessorio04 = new Acessorio();
        acessorio04.setNome("Monitoramento");
        acessorio04.setDescricao("Monitoramento avançado da bateria");
        acessorio04.setPreco(499.99);

        a.add(acessorio01);
        a.add(acessorio02);
        a.add(acessorio03);
        a.add(acessorio04);

        return a;
    }

    private Carro criarCarro() {

        Marca marca = criar("Zx1");

        Carro bydModelo1 = new Carro();
        bydModelo1.setNome("BYD Modelo 1");
        bydModelo1.setCor("Preto");
        bydModelo1.setMarca(marca);
        bydModelo1.setPreco(150000.00);
        return bydModelo1;
    }

    private Marca criar(String cod) {
        Marca marca = new Marca();
        marca.setNome("BYD");
        marca.setCodigo(cod);
        return marcaDao.cadastrar(marca);
    }

}
