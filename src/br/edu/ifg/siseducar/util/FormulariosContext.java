/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg.siseducar.util;

import br.edu.ifg.siseducar.frame.CadastroCategoriaFrm;
import br.edu.ifg.siseducar.frame.CadastroFluxoDeCaixaFrm;
import br.edu.ifg.siseducar.frame.Principal;
import java.beans.PropertyVetoException;


/**
 *
 * @author gustavo
 */
public class FormulariosContext {
    
    private static CadastroCategoriaFrm cadastroCategoriaFrm;
    private static CadastroFluxoDeCaixaFrm cadastroFluxoCaixaFrm;
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
    
    public static void showCadastroFluxoCaixa() {
        try {
            if(cadastroFluxoCaixaFrm == null){
                cadastroFluxoCaixaFrm = new CadastroFluxoDeCaixaFrm();
                principalFrm.addInternal(cadastroFluxoCaixaFrm);
            }
            cadastroFluxoCaixaFrm.setVisible(true);
            cadastroFluxoCaixaFrm.setIcon(false);
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
