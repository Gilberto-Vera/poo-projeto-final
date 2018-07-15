package br.edu.ifg.poo.util;

import static br.edu.ifg.poo.Main.conexao;
import br.edu.ifg.poo.vo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Banco {
    
    private static List<Categoria> categorias = new ArrayList();
    private static Integer id_logado = -1;

    public static String nomeCategoria(Integer id){
        Statement stmt = null;
        
        try{
            String sql = "SELECT * FROM categoria WHERE id = "+id;
            stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                 String nome = rs.getString("nome");
                 return nome;
            }
        } catch (SQLException ex) {
            System.out.println("Erro Categoria");
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "erro";
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
     * @return the id_logado
     */
    public static Integer getId_logado() {
        return id_logado;
    }

    /**
     * @param aId_logado the id_logado to set
     */
    public static void setId_logado(Integer aId_logado) {
        id_logado = aId_logado;
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
