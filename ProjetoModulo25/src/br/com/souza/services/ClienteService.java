/**
 * 
 */
package br.com.souza.services;

import br.com.souza.dao.IClienteDAO;
import br.com.souza.domain.Cliente;
import br.com.souza.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	

	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);

	}


	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}


}
