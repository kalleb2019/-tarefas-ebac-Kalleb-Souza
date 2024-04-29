package br.com.souza.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name="marca_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
    private Integer id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "codigo", length = 30, unique = true, nullable = false)
    private String codigo;

    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;
    public Marca() {

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
