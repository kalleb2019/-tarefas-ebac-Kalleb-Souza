/**
 * 
 */
package br.com.souza;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.souza.dao.ClienteDaoMock;
import br.com.souza.dao.IClienteDAO;
import br.com.souza.domain.Cliente;
import br.com.souza.exceptions.TipoChaveNaoEncontradaException;
import br.com.souza.services.ClienteService;
import br.com.souza.services.IClienteService;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Lucas");
		cliente.setCidade("Minas Gerais");
		cliente.setEnd("dhskhkjad");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(3398423137L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Raphael souza");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Raphael souza", cliente.getNome());
	}
}
