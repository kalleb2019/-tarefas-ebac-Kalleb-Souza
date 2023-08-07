package com.carro.fabricas;

import com.carro.carroceria.Carroceria;
import com.carro.carroceria.CarroceriaSedan;
import com.carro.direcao.Direcao;
import com.carro.direcao.DirecaoEletrica;
import com.carro.fabricante.Fabricante;
import com.carro.fabricante.FabricanteTesla;
import com.carro.freio.Freio;
import com.carro.freio.FreioAbs;
import com.carro.motores.Motor;
import com.carro.motores.MotorEletrico;
import com.carro.rodas.Roda;
import com.carro.rodas.RodaLigaLeve;

public class FabricaEletrico implements FabricaCarro{

    @Override
    public Motor criarMotor() {
        // TODO Auto-generated method stub
        return new MotorEletrico();
    }

    @Override
    public Roda criarRoda() {
         // TODO Auto-generated method stub
         return new RodaLigaLeve();
    }

    @Override
    public Carroceria criarCarroceiria() {
        // TODO Auto-generated method stub
        return new CarroceriaSedan();
    }

    @Override
    public Direcao criarDirecao() {
        // TODO Auto-generated method stub
        return new DirecaoEletrica();
    }


    @Override
    public Freio criarFreio() {
        // TODO Auto-generated method stub
        return new FreioAbs();
    }

    @Override
    public Fabricante criarFabricante() {
        // TODO Auto-generated method stub
        return new FabricanteTesla();
    }
    
}
