package com.carro.fabricas;

import com.carro.carroceria.Carroceria;
import com.carro.carroceria.CarroceriaCoupe;
import com.carro.direcao.Direcao;
import com.carro.direcao.DirecaoEsportiva;
import com.carro.fabricante.Fabricante;
import com.carro.fabricante.FabricanteBmw;
import com.carro.freio.Freio;
import com.carro.freio.FreioAbs;
import com.carro.motores.Motor;
import com.carro.motores.MotorV8;
import com.carro.rodas.Roda;
import com.carro.rodas.RodaSportiva;

public class FabricaCoupe implements FabricaCarro{

    @Override
    public Motor criarMotor() {
        // TODO Auto-generated method stub
        return new MotorV8();
    }

    @Override
    public Roda criarRoda() {
        // TODO Auto-generated method stub
        return new RodaSportiva();
    }

    @Override
    public Carroceria criarCarroceiria() {
        // TODO Auto-generated method stub
       return new CarroceriaCoupe();
    }

    @Override
    public Direcao criarDirecao() {
        // TODO Auto-generated method stub
        return new DirecaoEsportiva ();
    }

    @Override
    public Freio criarFreio() {
        // TODO Auto-generated method stub
        return new FreioAbs();
    }

    @Override
    public Fabricante criarFabricante() {
        // TODO Auto-generated method stub
        return new FabricanteBmw();
    }
    
}
