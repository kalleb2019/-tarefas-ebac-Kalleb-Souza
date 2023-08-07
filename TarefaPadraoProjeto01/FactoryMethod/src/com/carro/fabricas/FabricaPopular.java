package com.carro.fabricas;


import com.carro.carroceria.Carroceria;
import com.carro.carroceria.CarroceriaHatch;
import com.carro.direcao.Direcao;
import com.carro.direcao.DirecaoMecanica;
import com.carro.fabricante.Fabricante;
import com.carro.fabricante.FabricanteVolkswagen;
import com.carro.freio.Freio;
import com.carro.freio.FreioDisco;
import com.carro.motores.Motor;
import com.carro.motores.MotorUmPontoZero;
import com.carro.rodas.Roda;
import com.carro.rodas.RodaAco;

public class FabricaPopular implements FabricaCarro{

    @Override
    public Motor criarMotor() {
        // TODO Auto-generated method stub
        return new MotorUmPontoZero();
    }

    @Override
    public Roda criarRoda() {
        // TODO Auto-generated method stub
        return new RodaAco();
    }

    @Override
    public Carroceria criarCarroceiria() {
        // TODO Auto-generated method stub
        return new CarroceriaHatch();
    }

    @Override
    public Direcao criarDirecao() {
        // TODO Auto-generated method stub
        return new DirecaoMecanica();
    }

   

    @Override
    public Freio criarFreio() {
        // TODO Auto-generated method stub
        return new FreioDisco();
    }

    @Override
    public Fabricante criarFabricante() {
        // TODO Auto-generated method stub
        return new FabricanteVolkswagen();
    }
    
}
