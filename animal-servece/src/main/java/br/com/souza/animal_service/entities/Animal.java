package br.com.souza.animal_service.entities;

import br.com.souza.animal_service.entities.enums.TipoAnimal;
import jakarta.persistence.*;
import org.hibernate.exception.ConstraintViolationException;

import java.sql.Date;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(unique=true, nullable=false)
    private String codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipoAnimal;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private String cordenada;

    @Column(nullable = false)
    private Boolean isCastrado;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private String sexo;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataSaida;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Boolean mausTrato;

    @Column(nullable = false)
    private String recebedor;

    @Column
    private Date dataObito;

    public Animal() {

    }

    public Animal(TipoAnimal tipoAnimal) {
        setTipoAnimal(tipoAnimal);
    }

    public Integer getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = TipoAnimal.valueOf(tipoAnimal.getIndice());
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getMausTrato() {
        return mausTrato;
    }

    public void setMausTrato(Boolean mausTrato) {
        this.mausTrato = mausTrato;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public Boolean isCastrado() {
        return isCastrado;
    }

    public void setIsCastrado(Boolean castrado) {
        isCastrado = castrado;
    }

    public String getCordenada() {
        return cordenada;
    }
    public void setCordenada(String cordenada) {
        this.cordenada = cordenada;
    }
}
