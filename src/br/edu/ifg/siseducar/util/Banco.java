package br.edu.ifg.siseducar.util;

import static br.edu.ifg.poo.Main.conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco {
    
    
        public static boolean verificaLogin(String user, String senha){
        try {
            String SQL = "SELECT * from usuario WHERE login = '" + user +"' AND senha = '" + senha + "';";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if(rs.next()){
                //id_logado = rs.getInt("id");
                //user_logado = rs.getString("login");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
    public static void atualizaBanco(String sql) throws SQLException{
        Statement stm = conexao.createStatement();
        stm.executeUpdate(sql);
    }

}
