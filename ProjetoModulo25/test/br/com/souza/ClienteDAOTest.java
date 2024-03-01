/**
 * 
 */
package br.com.souza;


import br.com.souza.dao.ClienteDAO;
import br.com.souza.dao.IClienteDAO;
import br.com.souza.domain.Cliente;
import br.com.souza.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;

	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAO();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(1231233L);
		cliente.setNome("Lucas");
		cliente.setCidade("Minas Gerais");
		cliente.setEnd("dhskhkjad");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(3398423137L);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(423423423L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Raphael souza");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Raphael souza", cliente.getNome());
	}

	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}
}
