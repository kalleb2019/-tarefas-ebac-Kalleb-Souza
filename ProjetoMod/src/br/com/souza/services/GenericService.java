package br.com.souza.services;

import br.com.souza.dao.generics.IGenericDao;
import br.com.souza.domain.Persistente;
import br.com.souza.exceptions.DAOException;
import br.com.souza.exceptions.MaisDeUmRegistroException;
import br.com.souza.exceptions.TableException;
import br.com.souza.exceptions.TipoChaveNaoEncontradaException;
import br.com.souza.services.generics.IGenericsServices;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable>  implements IGenericsServices<T, E> {

    protected IGenericDao<T,E> dao;

    public GenericService(IGenericDao<T, E> dao) {
        this.dao = dao;
    }
    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws DAOException {
        try {
            return this.dao.consultar(valor);
        } catch (MaisDeUmRegistroException | TableException e) {
            
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }
}
