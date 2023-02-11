public class Pjuridica extends Pessoas {
    private String cnpj;

    public Pjuridica (String nome,String sobreNome,String cidade,String estado,String cnpj){
        super(nome,sobreNome,cidade,estado);
        setCnpj(cnpj);
    }

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    @Override
    public double calcularImposto(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " " + calcularImposto();

    }
}
