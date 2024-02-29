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
import modelo.Conta;
import modelo.Usuario;

/**
 *
 * @author Daiane
 */
public class ContaDao {

    /**
     *
     * @param conta
     * @throws SQLException
     */
    
    //ADICIONANDO CONTA A RECEBER
    public void adicionar(Conta conta)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "INSERT INTO contas_receber(status,nome,nascimento,tipo,cnpj,celular,numero_nota,valor_nota,data_nota, obs )VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,conta.getStatus());
        ps.setString(2, conta.getNome());
        ps.setString(3,conta.getNascimento());
        ps.setString(4, conta.getTipo());
        ps.setString(5, conta.getCnpj());
        ps.setString(6, conta.getCelular());
        ps.setString(7, conta.getNumeroNota());
        ps.setString(8, conta.getValorNota());
        ps.setString(9, conta.getDataNota());
        ps.setString(10, conta.getObs());
        ps.execute();
        ps.close();
        conexao.close();
        
    }
    
    //ADICIONANDO CONTA A PAGAR
    public void adicionarP(Conta conta)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "INSERT INTO contas_pagar(status,nome,nascimento,tipo,cnpj,celular,numero_nota,valor_nota,data_nota, obs )VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,conta.getStatus());
        ps.setString(2, conta.getNome());
        ps.setString(3,conta.getNascimento());
        ps.setString(4, conta.getTipo());
        ps.setString(5, conta.getCnpj());
        ps.setString(6, conta.getCelular());
        ps.setString(7, conta.getNumeroNota());
        ps.setString(8, conta.getValorNota());
        ps.setString(9, conta.getDataNota());
        ps.setString(10, conta.getObs());
        ps.execute();
        ps.close();
        conexao.close();
        
    }
    
    //ALTERANDO CONTA A RECEBER
    public void alterar(Conta conta)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE contas_receber set status=?,nome=?,nascimento=?,tipo=?,cnpj=?,celular=?,numero_nota=?,valor_nota=?,data_nota=?, obs=?"
                + " where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,conta.getStatus());
        ps.setString(2, conta.getNome());
        ps.setString(3,conta.getNascimento());
        ps.setString(4, conta.getTipo());
        ps.setString(5, conta.getCnpj());
        ps.setString(6, conta.getCelular());
        ps.setString(7, conta.getNumeroNota());
        ps.setString(8, conta.getValorNota());
        ps.setString(9, conta.getDataNota());
        ps.setString(10, conta.getObs());
        ps.setInt(11, conta.getCod());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    //ALTERANDO CONTA A PAGAR
        public void alterarP(Conta conta)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE contas_pagar set status=?,nome=?,nascimento=?,tipo=?,cnpj=?,celular=?,numero_nota=?,valor_nota=?,data_nota=?, obs=?"
                + " where id=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,conta.getStatus());
        ps.setString(2, conta.getNome());
        ps.setString(3,conta.getNascimento());
        ps.setString(4, conta.getTipo());
        ps.setString(5, conta.getCnpj());
        ps.setString(6, conta.getCelular());
        ps.setString(7, conta.getNumeroNota());
        ps.setString(8, conta.getValorNota());
        ps.setString(9, conta.getDataNota());
        ps.setString(10, conta.getObs());
        ps.setInt(11, conta.getCod());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
        
    public Object buscarUltima() throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "select * from contas_receber where id = (SELECT MAX(id) FROM CONTAS_RECEBER)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Object c = null;
        while (rs.next()) {
            Conta conta = new Conta(rs.getInt("id"), rs.getString("status"),
                    rs.getString("nome"),rs.getString("nascimento"),rs.getString("tipo"), rs.getString("cnpj"), rs.getString("celular"),
                    rs.getString("numero_nota"),rs.getString("valor_nota"),
                    rs.getString("data_nota"), rs.getString("obs"));
            c=conta;
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return c;

    }
        public List<Conta> buscarPelaDescricao(String descricao) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from contas_receber where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + descricao + "%");
        ResultSet rs = ps.executeQuery();
        List<Conta> pessoas = new ArrayList<>();
        while (rs.next()) {
            Conta conta = new Conta(rs.getInt("id"), rs.getString("status"),
                    rs.getString("nome"),rs.getString("nascimento"),rs.getString("tipo"), rs.getString("cnpj"), rs.getString("celular"),
                    rs.getString("numero_nota"),rs.getString("valor_nota"),
                    rs.getString("data_nota"), rs.getString("obs"));
            pessoas.add(conta);
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return pessoas;

    }
        
            
    public Conta buscarPeloId(String descricao) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        Conta conta = new Conta();
        String sql = "Select * from contas_receber where id like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + descricao + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            //Conta conta = new Conta(rs.getInt("id"), rs.getString("status"),
                    //rs.getString("nome"),rs.getString("nascimento"),rs.getString("tipo"), 
                    //rs.getString("cnpj"), rs.getString("celular"),
                    //rs.getString("numero_nota"),rs.getString("valor_nota"),
                    //rs.geStString("data_nota"), rs.getString("obs"));
            conta.setCod(rs.getInt("id"));
            conta.setStatus(rs.getString("status"));
            conta.setNome(rs.getString("nome"));
            conta.setNascimento(rs.getString("nascimento"));
            conta.setTipo(rs.getString("tipo"));
            conta.setCnpj(rs.getString("cnpj"));
            conta.setCelular(rs.getString("celular"));
            conta.setNumeroNota(rs.getString("numero_nota"));
            conta.setValorNota(rs.getString("valor_nota"));
            conta.setDataNota(rs.getString("data_nota"));
            conta.setObs( rs.getString("obs"));
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return conta;

    }
    
    public List<Conta> buscarPelaDescricaoP(String descricao) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from contas_pagar where nome like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + descricao + "%");
        ResultSet rs = ps.executeQuery();
        List<Conta> pessoas = new ArrayList<>();
        while (rs.next()) {
            Conta conta = new Conta(rs.getInt("id"), rs.getString("status"),
                    rs.getString("nome"),rs.getString("nascimento"),rs.getString("tipo"), rs.getString("cnpj"), rs.getString("celular"),
                    rs.getString("numero_nota"),rs.getString("valor_nota"),
                    rs.getString("data_nota"), rs.getString("obs"));
            pessoas.add(conta);
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return pessoas;

    }
    
    
    public void remover(int codigo)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql="delete from contas_receber where id= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
         
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    public void removerP(int codigo)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql="delete from contas_pagar where id= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
         
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    

}
