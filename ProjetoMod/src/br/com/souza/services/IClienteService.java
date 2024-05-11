package br.com.souza.services.generics;

import br.com.souza.domain.Cliente;
import br.com.souza.exceptions.DAOException;

public interface IClienteService extends IGenericsServices<Cliente, Long>{
    Cliente buscarPorCPF(Long cpf) throws DAOException;
}
