/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Daiane
 */
public class Conta {
    private String status = "Fechado";
    private String nome;
    private String nascimento;
    private String tipo;
    private String cnpj;
    private String celular;
    private String numeroNota;
    private String valorNota;
    private String dataNota;
    private String obs;
    private int cod;

    public Conta(String nome, String nascimento, String tipo, String cnpj, String celular, String numeroNota, String valorNota,String obs, String dataNota) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipo = tipo;
        this.cnpj = cnpj;
        this.celular = celular;
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.dataNota = dataNota;
        this.obs = obs;
        status = "Aberto";
    }
    
    public Conta(String status,String nome, String nascimento, String tipo, String cnpj, String celular, String numeroNota,String valorNota, String obs, String vencimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipo = tipo;
        this.cnpj = cnpj;
        this.celular = celular;
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.dataNota = dataNota;
        this.obs = obs;
        this.status = status;
    }
    
    public Conta(int cod, String status,String nome, String nascimento, String tipo, String cnpj, String celular, String numeroNota, String valorNota, String dataNota, String obs) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipo = tipo;
        this.cnpj = cnpj;
        this.celular = celular;
        this.numeroNota = numeroNota;
        this.valorNota = valorNota;
        this.dataNota = dataNota;
        this.obs = obs;
        this.status = status;
        this.cod = cod;
    }
    
    public Conta(){
        
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getValorNota() {
        return valorNota;
    }

    public void setValorNota(String valorNota) {
        this.valorNota = valorNota;
    }

    public String getDataNota() {
        return dataNota;
    }

    public void setDataNota(String dataNota) {
        this.dataNota = dataNota;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.status);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.nascimento);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.cnpj);
        hash = 59 * hash + Objects.hashCode(this.celular);
        hash = 59 * hash + Objects.hashCode(this.numeroNota);
        hash = 59 * hash + Objects.hashCode(this.valorNota);
        hash = 59 * hash + Objects.hashCode(this.dataNota);
        hash = 59 * hash + Objects.hashCode(this.obs);
        hash = 59 * hash + this.cod;
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
        final Conta other = (Conta) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.numeroNota, other.numeroNota)) {
            return false;
        }
        if (!Objects.equals(this.valorNota, other.valorNota)) {
            return false;
        }
        if (!Objects.equals(this.dataNota, other.dataNota)) {
            return false;
        }
        return Objects.equals(this.obs, other.obs);
    }

    @Override
    public String toString() {
        return "Conta{" + "status=" + status + ", nome=" + nome + ", nascimento=" + nascimento + ", tipo=" + tipo + ", cnpj=" + cnpj + ", celular=" + celular + ", numeroNota=" + numeroNota + ", valorNota=" + valorNota + ", dataNota=" + dataNota + ", obs=" + obs + ", cod=" + cod + '}';
    }

  
}
