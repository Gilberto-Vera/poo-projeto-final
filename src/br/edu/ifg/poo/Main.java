/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo;

import br.edu.ifg.poo.frame.LoginFrm;
import br.edu.ifg.poo.util.Conexao;
import java.sql.Connection;


/**
 *
 * @author danilo
 */
public class Main {

    public static Connection conexao;

    public static void main(String[] args) {
        
        conexao = new Conexao().getConexao();
        new LoginFrm().setVisible(true);
        

    }

}
