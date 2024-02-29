/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import modelo.Usuario;

/**
 *
 * @author Daiane
 */
public class UsuarioDao {
    public Usuario login(String login, String senha) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql  = "select * from usuarios where login =? and senha =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        Usuario usuario = null;
        while(rs.next()){
            usuario = new Usuario();
            usuario.setCodigo(rs.getInt("codigo"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setNivel(rs.getString("nivel"));
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return usuario;
    }
    
    public void adicionar(Usuario usuario) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "insert into usuarios(nome, login, senha, nivel) values(?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3, usuario.getSenha());
        ps.setString(4, usuario.getNivel());
        ps.execute();
        ps.close();
        conexao.close();
    }
    
      public List<Usuario> buscarPelaDescricao(String descricao) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from usuarios where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + descricao + "%");
        ResultSet rs = ps.executeQuery();

        List<Usuario> pessoas = new ArrayList<>();
        while (rs.next()) {
            Usuario usuario = new Usuario(rs.getInt("codigo"), rs.getString("nome"),
                    rs.getString("login"),rs.getString("nivel"));
            pessoas.add(usuario);
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return pessoas;

    }
      
      public void remover(int codigo)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql="delete from usuarios where codigo= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
         
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
      public void alterar(Usuario usuario)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE usuarios set nome=?,login=?,senha=?,nivel=?"
                + " where codigo=?";
        //String conId = Integer.toString(venda.getContaId());
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,usuario.getNome());
        ps.setString(2,usuario.getLogin());
        ps.setString(3,usuario.getSenha());
        ps.setString(4, usuario.getNivel());
        ps.setInt(5, usuario.getCodigo());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
