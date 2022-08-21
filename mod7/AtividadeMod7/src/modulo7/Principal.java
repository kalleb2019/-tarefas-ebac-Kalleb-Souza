package modulo7;

public class Principal {
    public static void main(String args[]){
        Carro carro01 = new Carro();

        carro01.setModelo("Fusca");
        carro01.setMarca("volkswagen");
        carro01.setCor("Branco");
        carro01.setCombustivel("Gasolina");
        carro01.setVelocidade(90);
        carro01.setAnoFabricacao(1991);


        carro01.configuracaoVeiculo();
    }
}
