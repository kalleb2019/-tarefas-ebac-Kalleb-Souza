package modulo7;

/**
 *
 * @author Kalleb
 */
public class Carro {
    private String modelo ,marca, cor, combustivel;
    private int velocidade, anoFabricacao;


    public void configuracaoVeiculo(){
        System.out.println("modelo: "+modelo);
        System.out.println("marca: "+marca);
        System.out.println("cor: "+cor);
        System.out.println("combustivel: "+combustivel);
        System.out.println("velocidade: "+velocidade);
        System.out.println("anoFabricacao: "+anoFabricacao);
    }

    /**
     *
     * @return retorna o modelo do veiculo
     */
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int anoFabricacao(){
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

}
