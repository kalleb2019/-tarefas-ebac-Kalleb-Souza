package br.com.souza.services.generics;

import br.com.souza.domain.Persistente;
import br.com.souza.exceptions.DAOException;
import br.com.souza.exceptions.MaisDeUmRegistroException;
import br.com.souza.exceptions.TableException;
import br.com.souza.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericsServices <T extends Persistente, E extends Serializable>{



    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;
}
