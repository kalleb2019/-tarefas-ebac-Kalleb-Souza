package br.com.souza;

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(){

    }

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo =sexo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
}

