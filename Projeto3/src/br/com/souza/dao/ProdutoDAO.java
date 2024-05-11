package br.com.souza.dao;

import br.com.souza.dao.generics.GenericDao;
import br.com.souza.domain.Cliente;
import br.com.souza.domain.Produto;

public class ProdutoDAO extends GenericDao<Produto, Long> implements IProdutoDao{

    public ProdutoDAO() {
        super(Produto.class);
    }

}
