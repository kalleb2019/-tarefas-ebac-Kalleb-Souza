package com.carro;

public abstract class Carro {

    private String motor;
    private String roda;
    private String cor;
    private String modelo;
    private int cavalos;

    public Carro(String motor, String roda, String cor, String modelo, int cavalos) {
        this.motor = motor;
        this.roda = roda;
        this.cor = cor;
        this.modelo = modelo;
        this.cavalos = cavalos;
    }

    public String getMotor() {
        return this.motor;
    }

    public String getRoda() {
        return this.roda;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getCavalos() {
        return this.cavalos;
    }

    public String toString() {
        return "Modelo " + this.modelo + " Cavalos:  " + this.cavalos + " Cor: " + this.cor + " Roda: " + this.roda;
    }
}
