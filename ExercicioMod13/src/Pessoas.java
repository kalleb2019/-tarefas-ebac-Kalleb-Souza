public abstract class Pessoas {
    private  String nome;
    private  String sobreNome;
    private String cidade;
    private String estado;


    public Pessoas (String nome,String sobreNome,String cidade,String estado){
      setNome(nome);
      setSobreNome(sobreNome);
      setCidade(cidade);
      setEstado(estado);
    }

    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobreNome(){
        return this.sobreNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(String estado){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public abstract double calcularImposto();
    
    @Override
    public String toString(){
        return this.getNome() +" "+this.getSobreNome()+" "+this.estado; 
    }

}
