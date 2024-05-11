package br.com.souza.dao;

import br.com.souza.dao.generics.GenericDao;
import br.com.souza.dao.generics.IGenericDao;
import br.com.souza.domain.Cliente;

public class ClienteDao extends GenericDao<Cliente, Long> implements IClienteDao {
    public ClienteDao() {
        super(Cliente.class);
    }
}
