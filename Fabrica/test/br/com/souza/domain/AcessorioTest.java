package br.com.souza.domain;

import br.com.souza.dao.AcessorioDao;
import br.com.souza.dao.IAcessorioDao;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AcessorioTest {
    private IAcessorioDao acessorioDao;

    public AcessorioTest(){
        acessorioDao = new AcessorioDao();
    }
    
    @Test
    public void inserirAcessorio(){
        List<Acessorio> a = new ArrayList<Acessorio>();
        Acessorio acessorio01 = new Acessorio();
        acessorio01.setNome("Rodas");
        acessorio01.setDescricao("Rodas de liga");
        acessorio01.setPreco(799.99);

        Acessorio acessorio02 = new Acessorio();
        acessorio02.setNome("Central");
        acessorio02.setDescricao("tela touchscreen e conexão Bluetooth");
        acessorio02.setPreco(1499.99);

        Acessorio acessorio03 = new Acessorio();
        acessorio03.setNome("Kit de Xenon");
        acessorio03.setDescricao("Kit de lâmpadas de Xenon para faróis dianteiros");
        acessorio03.setPreco(299.99);

        Acessorio acessorio04 = new Acessorio();
        acessorio04.setNome("Tapetes");
        acessorio04.setDescricao("Tapetes personalizados com logo da marca do carro");
        acessorio04.setPreco(99.99);

        Acessorio acessorio05 = new Acessorio();
        acessorio05.setNome("Câmera de Ré");
        acessorio05.setDescricao("Câmera com visão noturna e guias de estacionamento");
        acessorio05.setPreco(199.99);

        a.add(acessorio01);
        a.add(acessorio02);
        a.add(acessorio03);
        a.add(acessorio04);
        a.add(acessorio05);

        a.forEach(i -> {Acessorio test = acessorioDao.Cadastrar(i);
            Assert.assertNotNull(test.getId());
        });

    }
}
