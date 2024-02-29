/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.Conexao;
import modelo.Conta;
import modelo.Usuario;
import modelo.Venda;

/**
 *
 * @author Daiane
 */
public class VendaDao {

    
    //ALTERANDO CONTA A RECEBER
    public void alterar(Venda venda)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql= "UPDATE venda set erp=?,scm=?,crm=?,sig=?,acomp=?,trein=?,sup=?,valor=?,conta_id=?"
                + " where id=?";
        //String conId = Integer.toString(venda.getContaId());
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1,venda.getErp());
        ps.setString(2, venda.getScm());
        ps.setString(3,venda.getCrm());
        ps.setString(4, venda.getSig());
        ps.setString(5, venda.getAcomp());
        ps.setString(6, venda.getTrein());
        ps.setString(7, venda.getSup());
        ps.setString(8, venda.getValor());
        ps.setString(9, venda.getContaId());
        ps.setInt(10, venda.getId());
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
  
        
    public List<Venda> buscarPelaDescricao(String descricao) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql = "Select * from venda where id like ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + descricao + "%");
        ResultSet rs = ps.executeQuery();
        List<Venda> pessoas = new ArrayList<>();
        while (rs.next()) {
            Venda venda = new Venda(rs.getInt("id"), rs.getString("erp"),
                    rs.getString("scm"),rs.getString("crm"),rs.getString("sig"), rs.getString("acomp"), rs.getString("trein"),
                    rs.getString("sup"),rs.getString("valor"),
                    rs.getString("conta_id"));
            pessoas.add(venda);
        }
        rs.close();
        ps.close();
        conexao.close();
        
        return pessoas;

    }
    
    public void remover(int codigo)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        String sql="delete from venda where id= ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
         
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    public void adicionarVenda(Venda venda) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO venda(erp, scm,crm,sig,acomp,trein,sup,valor, conta_id) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, venda.getErp());
        ps.setString(2, venda.getScm());
        ps.setString(3, venda.getCrm());
        ps.setString(4, venda.getSig());
        ps.setString(5, venda.getAcomp());
        ps.setString(6, venda.getTrein());
        ps.setString(7, venda.getSup());
        ps.setString(8, venda.getValor());
        ps.setString(9, venda.getContaId());
        ps.execute();
        ps.close();
        conexao.close();
    }

    public void adicionar(Venda venda) throws SQLException {
         Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO venda(erp, scm,crm,sig,acomp,trein,sup,valor, conta_id) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, venda.getErp());
        ps.setString(2, venda.getScm());
        ps.setString(3, venda.getCrm());
        ps.setString(4, venda.getSig());
        ps.setString(5, venda.getAcomp());
        ps.setString(6, venda.getTrein());
        ps.setString(7, venda.getSup());
        ps.setString(8, venda.getValor());
        ps.setString(9, venda.getContaId());
        ps.execute();
        ps.close();
        conexao.close();
        
        String vendaa = "Dados de venda:\n"+ "Erp: "+venda.getErp() + " \n Scm: " + venda.getScm()+" \n Crm: "+venda.getCrm()
                + "\n Sig: " + venda.getSig()+ "\n Acompanhamento: "+ venda.getAcomp()+ "\n Treinamento: "+ venda.getTrein()
                + "\n Suporte: " + venda.getSup() + "\n Valor total: "+ venda.getValor()+ "\n Id da conta: "+ venda.getContaId();

        byte[] buff=vendaa.getBytes();

        try{
            RandomAccessFile raf = new RandomAccessFile("c:\\nota\\venda"+venda.getContaId()+".txt", "rw");
            raf.write(buff);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
