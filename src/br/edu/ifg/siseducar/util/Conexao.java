package br.edu.ifg.siseducar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    public static Connection getConexao(){
        String DRIVER = "org.postgresql.Driver";
        String URL = "jdbc:postgresql://localhost/ProjetoFinal";
        String USUARIO = "postgres";
        String SENHA = "14212028";
        try {
            Class.forName(DRIVER);
            Connection con;
            con = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
            return con;
        } catch (ClassNotFoundException ex){
            System.err.print(ex.getMessage());
            return null;
        } catch (SQLException e){
            System.err.print(e.getMessage());
            return null;
        }
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
