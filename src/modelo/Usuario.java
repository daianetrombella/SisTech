/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Daiane
 */
public class Usuario {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String nivel;

    public Usuario(String nome, String login, String senha, String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }
    
    public Usuario(int codigo,String nome, String login, String nivel){
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.nivel = nivel;
    }
    
    public Usuario() {
    }

    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", nivel=" + nivel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return Objects.equals(this.nivel, other.nivel);
    }
    
    
}
