package com.carro;

import com.carro.carroceria.Carroceria;
import com.carro.direcao.Direcao;
import com.carro.fabricante.Fabricante;
import com.carro.fabricas.FabricaCarro;
import com.carro.fabricas.FabricaCoupe;
import com.carro.fabricas.FabricaEletrico;
import com.carro.fabricas.FabricaPopular;
import com.carro.freio.Freio;
import com.carro.motores.Motor;
import com.carro.rodas.Roda;

public class Main {
    public static void criarCarro(FabricaCarro fabrica){
        Motor a = fabrica.criarMotor();
        Roda b = fabrica.criarRoda();
        Carroceria c = fabrica.criarCarroceiria();
        Direcao d = fabrica.criarDirecao();
        Freio e = fabrica.criarFreio();
        Fabricante f = fabrica.criarFabricante();
        
        System.out.println("Motor: "+a.getTipo()+"\n" + "Roda: "+b.getTipoRoda()+"\n"+"Carroceiria: "+c.getTipo()+"\n"+"Direção: "+d.getTipo()+"\n"+"Freio: "+e.getTipo()+"\n"+"Fabricante: "+f.getTipo()+"\n");
    }

    public static void main(String[] args) {
        FabricaCarro c1 = new FabricaCoupe();
        FabricaCarro c2 = new FabricaEletrico();
        FabricaCarro c3 = new FabricaPopular();

        criarCarro(c1);
        criarCarro(c2);
        criarCarro(c3);
        
    }
}
