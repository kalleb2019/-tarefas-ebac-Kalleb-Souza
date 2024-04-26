package br.com.souza;

import br.com.souza.dao.IProdutoDAO;
import br.com.souza.dao.ProdutoDAO;
import br.com.souza.domain.Produto;
import org.jboss.jandex.Main;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;
    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }
    @Test
    public void cadastrarProduto() {
        Produto produto = new Produto();
        produto.setNome("Camisa");
        produto.setPreco(30d);
        produtoDAO.cadastrar(produto);
        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());
    }
   
}
