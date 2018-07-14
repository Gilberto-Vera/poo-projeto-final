package br.edu.ifg.siseducar.vo;

/**
 *
 * @author gilberto
 */
public class Categoria {
    private Integer id;
    private String descricao;
    private Integer id_catSup;
    
    public Categoria(Integer id, String descricao, Integer id_catSup) {
        this.id = id;
        this.descricao = descricao;
        this.id_catSup = id_catSup;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the id_catSup
     */
    public Integer getId_catSup() {
        return id_catSup;
    }

    /**
     * @param id_catSup the id_catSup to set
     */
    public void setId_catSup(Integer id_catSup) {
        this.id_catSup = id_catSup;
    }
}
