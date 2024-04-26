package br.com.souza.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="prod_seq")
    @SequenceGenerator(name="prod_seq", sequenceName="sq_produto", initialValue = 1, allocationSize = 1)
    private int id;
    @Column(name = "nome", nullable = false, length = 50)
    private String Nome;
    @Column(name = "preco", nullable = false)
    private Double preco;

    public Produto(){

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
}
