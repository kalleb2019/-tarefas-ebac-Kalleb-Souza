package br.com.souza;

import br.com.souza.dao.ClienteDao;
import br.com.souza.dao.mock.ClienteDaoMock;
import br.com.souza.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        ClienteService c = new ClienteService(new ClienteDaoMock());
        Assert.assertEquals("Salvo", c.salvar());
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erro(){
        ClienteService c = new ClienteService(new ClienteDao());
        Assert.assertEquals("Salvo",c.salvar());
    }
}
