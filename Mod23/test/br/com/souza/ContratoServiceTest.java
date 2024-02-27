package br.com.souza;

import br.com.souza.dao.ContratoDao;
import br.com.souza.dao.IContratoDao;
import br.com.souza.dao.mock.ContratoDaoMock;
import br.com.souza.service.ContratoService;
import br.com.souza.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService servico = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",servico.salvar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroSalvarTestDados(){
        IContratoDao contrato = new ContratoDao();
        IContratoService servico = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",servico.salvar());
    }

    @Test
    public void buscarTestMock(){
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService service = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",service.buscar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void buscarTest(){
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",service.buscar() );
    }

    @Test
    public void excluirTestMock(){
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService servico = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",servico.excluir());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void excluirTest(){
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",service.excluir());
    }
    @Test
    public void atualizarTestMock(){
        IContratoDao contrato = new ContratoDaoMock();
        IContratoService sevico = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",sevico.atualizar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void atualizarTest(){
        IContratoDao contrato = new ContratoDao();
        IContratoService service = new ContratoService(contrato);
        Assert.assertEquals("Sucesso",service.atualizar());

    }
}
