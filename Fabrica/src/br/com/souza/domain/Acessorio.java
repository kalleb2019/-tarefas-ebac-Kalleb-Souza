package br.com.souza.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column(name = "nome", nullable = false, length = 15)
    private String nome;
    @Column(name = "descricao", nullable = false, length = 50)
    private String descricao;
    @Column(name = "preco", nullable = false)
    private Double preco;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;

    public Acessorio() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
