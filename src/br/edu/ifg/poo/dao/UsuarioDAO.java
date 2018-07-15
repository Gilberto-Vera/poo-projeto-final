/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo.dao;

import static br.edu.ifg.poo.Main.conexao;
import br.edu.ifg.poo.util.Banco;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gilberto
 */
public class UsuarioDAO {
        public static boolean verificaLogin(String user, String senha){
        try {
            String SQL = "SELECT * from usuario WHERE login = '" + user +"' AND senha = '" + senha + "';";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if(rs.next()){
                Banco.setId_logado(rs.getInt("id"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
