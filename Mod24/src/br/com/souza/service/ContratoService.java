package br.com.souza.service;

import br.com.souza.dao.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao contrato;
    public ContratoService(IContratoDao contrato){
        this.contrato = contrato;
    }


    @Override
    public String salvar() {
        contrato.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contrato.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contrato.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contrato.atualizar();
        return "Sucesso";
    }

}
