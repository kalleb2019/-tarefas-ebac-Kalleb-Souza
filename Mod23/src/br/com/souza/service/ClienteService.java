package br.com.souza.service;

import br.com.souza.dao.IClienteDao;

public class ClienteService {

    private IClienteDao c;
    public ClienteService(IClienteDao c){
       this.c = c;
    }

    public String salvar(){
        c.salvar();
        return "Salvo";
    }
}
