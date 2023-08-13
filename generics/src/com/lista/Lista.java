package com.lista;

import java.util.ArrayList;

import com.carro.Carro;

public class Lista<T extends Carro> {

    private ArrayList<T> ListaCarro;

    public Lista() {
        this.ListaCarro = new ArrayList<T>();
    }

    public void pushCarro(T carro) {
        ListaCarro.add(carro);
    }

    public void mostrarCarro() {
        try {
            for (T e : ListaCarro) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
