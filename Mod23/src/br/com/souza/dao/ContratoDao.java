package br.com.souza.dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
         throw new UnsupportedOperationException("Sem Banco");
    }

    @Override
    public void buscar() {throw new UnsupportedOperationException("Sem Banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Sem Banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Sem Banco");
    }
}
