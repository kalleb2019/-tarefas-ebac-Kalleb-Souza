package br.com.souza;

import br.com.souza.dao.CursoDAO;
import br.com.souza.dao.ICursoDAO;
import br.com.souza.domain.Curso;
import org.junit.Assert;
import org.junit.Test;

public class CursoTest {
    private ICursoDAO cursoDAO;

    public CursoTest(){
        cursoDAO = new CursoDAO();
    }
    @Test
    public void cadastrar(){
        Curso c = new Curso();
        c.setCodigo("A33");
        c.setNome("Curso do Junim");
        c.setDescricao("Curso 1");
        Curso cadastrado = cursoDAO.cadastrar(c);
        Assert.assertNotNull(cadastrado);
    }
    public void alterar(){

    }
}
