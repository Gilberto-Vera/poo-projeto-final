/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.poo.util;

import br.edu.ifg.poo.frame.CadastroCategoriaFrm;
import br.edu.ifg.poo.frame.CadastroFluxoCaixaFrm;
import br.edu.ifg.poo.frame.CadastroUsuario;
import br.edu.ifg.poo.frame.Principal;
import java.beans.PropertyVetoException;


/**
 * @author gustavo
 */
public class FormulariosContext {
    
    private static CadastroCategoriaFrm cadastroCategoriaFrm;
    private static CadastroFluxoCaixaFrm cadastroFluxoCaixaFrm;
    private static CadastroUsuario cadastroUsuarioFrm;
    private static Principal principalFrm;
    
    public static void showCadastroCategoria() {
        try {
            if(cadastroCategoriaFrm == null){
                cadastroCategoriaFrm = new CadastroCategoriaFrm();
                principalFrm.addInternal(cadastroCategoriaFrm);
            }
            cadastroCategoriaFrm.setVisible(true);
            cadastroCategoriaFrm.setIcon(false);
        } catch (PropertyVetoException ex) {
            
        }
    }
    
        public static void showCadastroFluxoCaixaFrm() {
        try {
            if(cadastroFluxoCaixaFrm == null){
                cadastroFluxoCaixaFrm = new CadastroFluxoCaixaFrm();
                principalFrm.addInternal(cadastroFluxoCaixaFrm);
            }
            cadastroFluxoCaixaFrm.setVisible(true);
            cadastroFluxoCaixaFrm.setIcon(false);
        } catch (PropertyVetoException ex) {
            
        }
    }
   
        public static void showCadastroUsuario() {
        try {
            if(cadastroUsuarioFrm == null){
                cadastroUsuarioFrm = new CadastroUsuario();
                principalFrm.addInternal(cadastroUsuarioFrm);
            }
            cadastroUsuarioFrm.setVisible(true);
            cadastroUsuarioFrm.setIcon(false);
        } catch (PropertyVetoException ex) {
            
        }
    }


    public static void showPrincipalFrm() {
        if(principalFrm == null){
            principalFrm = new Principal();
        }
        principalFrm.setVisible(true);
        
    }
}
