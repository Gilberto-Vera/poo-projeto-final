package br.edu.ifg.siseducar.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static Connection conexao;
    private static final String URL = "jdbc:postgresql://localhost/ProjetoFinal";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "14212028";
    
    
    public static Connection getConexao(){
        try {
            if(conexao == null || conexao.isClosed()){
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
}
