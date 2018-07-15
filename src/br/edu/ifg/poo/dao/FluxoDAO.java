package br.edu.ifg.poo.dao;

import br.edu.ifg.poo.Main;
import br.edu.ifg.poo.exception.NegocioException;
import br.edu.ifg.poo.exception.SistemaException;
import br.edu.ifg.poo.util.Assert;
import br.edu.ifg.poo.util.Banco;
import br.edu.ifg.poo.vo.Fluxo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author gilberto
 */
public class FluxoDAO {
    
    public List<Fluxo> buscar(Fluxo entidade) throws SistemaException, NegocioException {
        try {
            StringBuilder sql = new StringBuilder("SELECT * FROM fluxo");
            sql.append(" WHERE id_usu = ").append(Banco.getId_logado());
            if(!Assert.isNull(entidade)){
                if(!Assert.isStringNullOrEmpty(entidade.getDesc())){
                    sql.append(" AND descri LIKE %?%,");
                }
                sql.replace(sql.lastIndexOf(","), sql.length(), "");
            }
            sql.append(" ORDER BY id ASC");
            
            PreparedStatement ps = Main.conexao.prepareStatement(sql.toString());
            
            if(!Assert.isNull(entidade)){
                if(!Assert.isStringNullOrEmpty(entidade.getDesc())){
                    ps.setString(1, entidade.getDesc());
                }
            }
            ResultSet rs = ps.executeQuery();
            List<Fluxo> fluxos = new ArrayList<>();
            while (rs.next()) {                
                Fluxo fluxo = new Fluxo();
                fluxo.setId(rs.getInt("id"));
                fluxo.setDesc(rs.getString("descri"));
                fluxo.setId_cat(rs.getInt("id_cat"));
                fluxo.setId_usu(rs.getInt("id_usu"));
                fluxo.setData(rs.getDate("data_fc"));
                fluxo.setValor(rs.getDouble("valor"));
                fluxos.add(fluxo);
            }
            return fluxos;
        } catch (SQLException ex) {
            throw new SistemaException("Erro ao buscar os registros.", ex);
        }
    }
    
    public List<Fluxo> pesquisa(Fluxo entidade, Date antes) throws SistemaException, NegocioException {
        try {
            Boolean[] teste = {false, false, false, false};
            StringBuilder sql = new StringBuilder("SELECT * FROM fluxo");
            sql.append(" WHERE id_usu = ").append(Banco.getId_logado());
            if(!Assert.isNull(entidade)){
                if(!Assert.isStringNullOrEmpty(entidade.getDesc())){
                    sql.append(" AND descricao LIKE ?");
                    teste[0] = true;
                }
                if((!Assert.isNull(antes)) && (!Assert.isNull(entidade.getData()))){
                    sql.append(" AND data BETWEEN ? AND ?");
                    teste[1] = true;
                } 
                if(!Assert.isNull(entidade.getId_cat())){
                    sql.append(" AND id_cat = ?");
                    teste[2] = true;
                }
            }
            sql.append(" ORDER BY id ASC");
            PreparedStatement ps = Main.conexao.prepareStatement(sql.toString());
            
            if(teste[0] && teste[1] && teste[2]){
                ps.setString(1, "%"+ entidade.getDesc() +"%");
                ps.setDate(2, new java.sql.Date(entidade.getData().getTime()));
                ps.setDate(3, new java.sql.Date(antes.getTime()));
                ps.setInt(4, entidade.getId_cat());
            } else if (teste[0] && teste[1]){
                ps.setString(1, "%"+ entidade.getDesc() +"%");
                ps.setDate(2, new java.sql.Date(entidade.getData().getTime()));
                ps.setDate(3, new java.sql.Date(antes.getTime()));
            } else if (teste[0] && teste[2]){
                ps.setString(1, "%"+ entidade.getDesc() +"%");
                ps.setInt(2, entidade.getId_cat());
            } else if (teste[1] && teste[2]){
                ps.setDate(1, new java.sql.Date(entidade.getData().getTime()));
                ps.setDate(2, new java.sql.Date(antes.getTime()));
                ps.setInt(3, entidade.getId_cat());
            } else if (teste[0]){
                ps.setString(1, "%"+ entidade.getDesc() +"%");
            } else if (teste[1]){
                ps.setDate(1, new java.sql.Date(entidade.getData().getTime()));
                ps.setDate(2, new java.sql.Date(antes.getTime()));
            } else if (teste[2]){
                ps.setInt(1, entidade.getId_cat());
            }
            
            ResultSet rs = ps.executeQuery();
            List<Fluxo> fluxos = new ArrayList<>();
            while (rs.next()) {                
                Fluxo fluxo = new Fluxo();
                fluxo.setId(rs.getInt("id"));
                fluxo.setDesc(rs.getString("descri"));
                fluxo.setId_usu(rs.getInt("id_usu"));
                fluxo.setId_cat(rs.getInt("id_cat"));
                fluxo.setData(rs.getDate("data_fc"));
                fluxo.setValor(rs.getDouble("valor"));
                fluxos.add(fluxo);
            }
            return fluxos;
        } catch (SQLException ex) {
            throw new SistemaException("Erro ao buscar os registros.", ex);
        }
    }
}
