package br.com.souza.reflection;

@Tabela(value = "Pessoa Abstrata")

public class Pessoa {

    private String nome;

    public Pessoa(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
