/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daiane
 */
public class Conexao {
     private final String database = "copel";
    private final String user = "root";
    private final String password = "";

    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/"
                    +database + "?userSSL=false",user, password);

        }catch(SQLException ex) {
            System.out.println("Erro ao tentar se conectar");
            throw new RuntimeException(ex);

        }

    }
}
