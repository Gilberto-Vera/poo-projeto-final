package br.edu.ifg.siseducar.dao;

import br.edu.ifg.siseducar.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gilberto
 */
public class Login {

    public boolean buscar(String nome, String senha) {
        try {
            Connection con = Conexao.getConexao();
            String query = "select * from usuario";
            if (!"".equals(nome.trim())) {
                query += "where home like %?%";
            }
            PreparedStatement ps = con.prepareStatement(query);
            if (!"".equals(nome.trim())) {
                ps.setString(1, nome);
            }

            ResultSet rs = ps.executeQuery();
            con.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
