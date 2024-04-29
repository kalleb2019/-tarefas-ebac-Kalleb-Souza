package br.com.souza.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="Carro_seq")
    @SequenceGenerator(name="Carro_seq", sequenceName="sq_Carro", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column(name = "nome")
    private String Nome;
    @Column(name = "preco")
    private Double preco;
    @Column(name = "cor")
    private String Cor;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"),
    referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "tb_carro_acessor", foreignKey = @ForeignKey(name = "fk_carro_acessor"),
            inverseJoinColumns = {
                    @JoinColumn (name = "id_acessorio_fk")
            })
    private List<Acessorio> acessorios;

    public Carro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
