/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo.vo;

import java.util.Date;

/**
 * @author gilberto
 */
public class Fluxo {
    
    private Integer id;
    private String desc;
    private Integer id_usu;
    private Integer id_cat;
    private Date data;
    private Double valor;
    
    public Fluxo(Integer id, String desc, Integer id_usu, Integer id_cat, Date data, Double valor) {
        this.id = id;
        this.desc = desc;
        this.id_usu = id_usu;
        this.id_cat = id_cat;
        this.data = data;
        this.valor = valor;
    }
    
    public Fluxo(){}

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
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the id_usu
     */
    public Integer getId_usu() {
        return id_usu;
    }

    /**
     * @param id_usu the id_usu to set
     */
    public void setId_usu(Integer id_usu) {
        this.id_usu = id_usu;
    }

    /**
     * @return the id_cat
     */
    public Integer getId_cat() {
        return id_cat;
    }

    /**
     * @param id_cat the id_cat to set
     */
    public void setId_cat(Integer id_cat) {
        this.id_cat = id_cat;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
