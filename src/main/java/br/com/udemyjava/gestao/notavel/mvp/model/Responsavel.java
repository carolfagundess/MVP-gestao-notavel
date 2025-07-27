package br.com.udemyjava.gestao.notavel.mvp.model;

import jakarta.persistence.*;
import java.util.Objects;

/**
 *
 * @author carol
 */
@Entity
@Table(name = "responsavel")
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResponsavel;

    private String nome;
    private String cpf;
    private String telefone;
    private String vinculo;
    private Integer horasVoluntariado;
    private Double creditos;

    public Responsavel() {
    }

    public Responsavel(String name, String cpf, String telefone, String vinculo, Integer horasVoluntariado, Double creditos) {
        this.nome = name;
        this.cpf = cpf;
        this.telefone = telefone;
        this.vinculo = vinculo;
        this.horasVoluntariado = horasVoluntariado;
        this.creditos = creditos;
    }

    public Responsavel(String name, String cpf, String telefone) {
        this.nome = name;
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
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idResponsavel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Responsavel other = (Responsavel) obj;
        return Objects.equals(this.idResponsavel, other.idResponsavel);
    }

    @Override
    public String toString() {
        return "Responsavel{" + "idResponsavel=" + idResponsavel + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", vinculo=" + vinculo + ", horasVoluntariado=" + horasVoluntariado + ", creditos=" + creditos + '}';
    }
    
}
