package com.carro.fabricas;

import com.carro.carroceria.Carroceria;
import com.carro.direcao.Direcao;
import com.carro.fabricante.Fabricante;
import com.carro.freio.Freio;
import com.carro.motores.Motor;
import com.carro.rodas.Roda;

public interface FabricaCarro {
    Motor criarMotor();
    Roda criarRoda();
    Carroceria criarCarroceiria();
    Direcao criarDirecao();
    Freio criarFreio();
    Fabricante criarFabricante();
}
