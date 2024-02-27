package br.com.souza.dao.mock;

import br.com.souza.dao.IClienteDao;

public class ClienteDaoMock implements IClienteDao {
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Sem Banco");
    }
}
