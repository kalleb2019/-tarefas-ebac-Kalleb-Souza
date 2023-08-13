package com.carro;

public class Bmw extends Carro {

    public Bmw(String motor, String roda, String cor, String modelo, int cavalos) {
        super(motor, roda, cor, modelo, cavalos);
    }

    @Override
    public String toString() {
        return "Bmw: " + super.toString();
    }

}
