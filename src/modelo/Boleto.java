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
public class Boleto {
    private int cod;
    private String nome;
    private String numero;
    private String vencimento;
    private String valor;
    private String tipo;
    private String barras;
    private String cnpjEmissor;
    private String cnpjPagador;
    private String obs;

    public Boleto(int cod, String nome, String numero, String vencimento, String valor, String tipo, String barras, String cnpjEmissor, String cnpjPagador, String obs) {
        this.cod = cod;
        this.nome = nome;
        this.numero = numero;
        this.vencimento = vencimento;
        this.valor = valor;
        this.tipo = tipo;
        this.barras = barras;
        this.cnpjEmissor = cnpjEmissor;
        this.cnpjPagador = cnpjPagador;
        this.obs =obs;
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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    public String getCnpjEmissor() {
        return cnpjEmissor;
    }

    public void setCnpjEmissor(String cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
    }

    public String getCnpjPagador() {
        return cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cod;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.vencimento);
        hash = 97 * hash + Objects.hashCode(this.valor);
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + Objects.hashCode(this.barras);
        hash = 97 * hash + Objects.hashCode(this.cnpjEmissor);
        hash = 97 * hash + Objects.hashCode(this.cnpjPagador);
        hash = 97 * hash + Objects.hashCode(this.obs);
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
        final Boleto other = (Boleto) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.vencimento, other.vencimento)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.barras, other.barras)) {
            return false;
        }
        if (!Objects.equals(this.cnpjEmissor, other.cnpjEmissor)) {
            return false;
        }
        if (!Objects.equals(this.cnpjPagador, other.cnpjPagador)) {
            return false;
        }
        return Objects.equals(this.obs, other.obs);
    }

    @Override
    public String toString() {
        return "Boleto{" + "cod=" + cod + ", nome=" + nome + ", numero=" + numero + ", vencimento=" + vencimento + ", valor=" + valor + ", tipo=" + tipo + ", barras=" + barras + ", cnpjEmissor=" + cnpjEmissor + ", cnpjPagador=" + cnpjPagador + ", obs=" + obs + '}';
    }

   
    
}
