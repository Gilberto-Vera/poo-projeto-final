package br.edu.ifg.siseducar.util;

import static br.edu.ifg.poo.Main.conexao;
import br.edu.ifg.siseducar.vo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco {
    
    private static List<Categoria> categorias = new ArrayList();
    
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
        
        public static void recarregaCategoria(){
            
        categorias.clear();
        //Statement stmt = null;
        
        try{
            String sql = "SELECT * FROM categoria ORDER BY id_cat";
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Integer id = rs.getInt("id_cat");
                String descr = rs.getString("descricao");
                Integer id_sup = rs.getInt("id_catsup");
                Categoria cat = new Categoria(id, descr, id_sup);
                categorias.add(cat);
            }
        } catch (SQLException ex) {
            System.out.println("Erro Categoria");
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
    public static void atualizaBanco(String sql) throws SQLException{
        Statement stm = conexao.createStatement();
        stm.executeUpdate(sql);
    }

    /**
     * @return the categorias
     */
    public static List<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias the categorias to set
     */
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public static void Query(String sql) throws SQLException{
        Statement stm = conexao.createStatement();
        stm.executeUpdate(sql);
    } 

}
