package br.com.udemyjava.gestao.notavel.mvp.model;

import jakarta.persistence.*;

/**
 *
 * @author carol
 */
@Entity
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResponsavel;

    private String name;
    private String cpf;
    private String telefone;
    private String vinculo;
    private Integer horasVoluntariado;
    private Double creditos;

    public Responsavel() {
    }

    public Responsavel(Integer idResponsavel, String name, String cpf, String telefone, String vinculo, Integer horasVoluntariado, Double creditos) {
        this.idResponsavel = idResponsavel;
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
        this.vinculo = vinculo;
        this.horasVoluntariado = horasVoluntariado;
        this.creditos = creditos;
    }

    public Responsavel(Integer idResponsavel, String name, String cpf, String telefone) {
        this.idResponsavel = idResponsavel;
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Integer getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Integer idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Integer getHorasVoluntariado() {
        return horasVoluntariado;
    }

    public void setHorasVoluntariado(Integer horasVoluntariado) {
        this.horasVoluntariado = horasVoluntariado;
    }

    public Double getCreditos() {
        return creditos;
    }

    public void setCreditos(Double creditos) {
        this.creditos = creditos;
    }

}
