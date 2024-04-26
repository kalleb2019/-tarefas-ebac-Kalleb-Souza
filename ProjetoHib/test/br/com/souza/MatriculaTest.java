package br.com.souza;

import br.com.souza.dao.IMatriculaDAO;
import br.com.souza.dao.MatriculaDAO;
import br.com.souza.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTest {
    private IMatriculaDAO matriculaDAO;

    public MatriculaTest() {
        matriculaDAO = new MatriculaDAO();
    }
    @Test
    public void cadastrar(){
        Matricula matricula = new Matricula();
        matricula.setCodigo("M22");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("MATRICULADA");
        matricula.setValor(30d);
        Matricula n1 = matriculaDAO.cadastrar(matricula);
        Assert.assertNotNull(n1);
        Assert.assertEquals(n1.getCodigo(), matricula.getCodigo());

    }
}
