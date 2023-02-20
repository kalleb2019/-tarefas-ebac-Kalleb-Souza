package Dao;

import java.util.Collection;

import Dao.domain.Cliente;

public interface IClienteDao {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarClientes();
    
}
