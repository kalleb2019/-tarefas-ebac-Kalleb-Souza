public class Pfisica extends Pessoas {
    private String cpf;
    private String rg;

    public Pfisica(String nome,String sobreNome,String cidade,String estado,String cpf,String rg){
        super(nome, sobreNome, cidade, estado);
        setCpf(cpf);
        setRg(rg);
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getRg(){
        return this.rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    
    @Override
    public double calcularImposto(){
        return 0;
    }
}
