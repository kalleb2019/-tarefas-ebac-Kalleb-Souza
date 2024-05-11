package br.com.souza.services.generics;

import br.com.souza.dao.generics.GenericDao;
import br.com.souza.dao.generics.IGenericDao;
import br.com.souza.domain.Persistente;
import br.com.souza.exceptions.DAOException;
import br.com.souza.exceptions.MaisDeUmRegistroException;
import br.com.souza.exceptions.TableException;
import br.com.souza.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class GenericService <T extends Persistente, E extends Serializable> implements  IGenericsServices<T,E> {

    protected IGenericDao<T, E> dao;
    public GenericService(IGenericDao<T, E> dao ) {
        this.dao = dao;
    }

    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }
}
