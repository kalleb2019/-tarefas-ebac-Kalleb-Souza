package com.carro;

public class Mercedes extends Carro {

    public Mercedes(String motor, String roda, String cor, String modelo, int cavalos) {
        super(motor, roda, cor, modelo, cavalos);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Mercedez: " + super.toString();
    }
}
