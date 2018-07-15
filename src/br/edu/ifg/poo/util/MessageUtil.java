package br.edu.ifg.poo.util;

import br.edu.ifg.poo.exception.NegocioException;
import br.edu.ifg.poo.exception.SistemaException;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Classe para lançamento de mensagem com {@link JOptionPane}
 * @author danilo
 * @version 09/07/2018
 */
public class MessageUtil {
    
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * @param component Componente para centralizar a mensagem
     * @param message Mensagem que será exibida
     * @param title Título do alert
     * @param messageType Tipo de Mensagem de erro do {@link JOptionPane}
     */
    public static void showMessage(Component component, String message, String title, int messageType){
        JOptionPane.showMessageDialog(component, message, title, messageType);
    }
    
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Informação, component = null e messageType = {@link JOptionPane#INFORMATION_MESSAGE}
     * @param message Mensagem que será exibida
     */
    public static void showMessage(String message){
        showMessage(null, message);
    }
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Informação e messageType = {@link JOptionPane#INFORMATION_MESSAGE}
     * @param component Componente para centralizar a mensagem
     * @param message Mensagem que será exibida
     */
    public static void showMessage(Component component, String message){
        showMessage(component, message, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Aviso e messageType = {@link JOptionPane#WARNING_MESSAGE}
     * @param component Componente para centralizar a mensagem
     * @param ex Exceção de Negócio com a mensagem de erro
     */
    public static void showMessage(Component component, NegocioException ex){
        showWarnMessage(component, ex.getMessage());
    }
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Aviso, component = null e messageType = {@link JOptionPane#WARNING_MESSAGE}
     * @param ex Exceção de Negócio com a mensagem de erro
     */
    public static void showMessage(NegocioException ex){
        showWarnMessage(null, ex.getMessage());
    }

    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Aviso, component = null e messageType = {@link JOptionPane#WARNING_MESSAGE}
     * @param message Mensagem que será exibida
     */
    public static void showWarnMessage(String message){
        showWarnMessage(null, message);
    }
    
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Aviso e messageType = {@link JOptionPane#WARNING_MESSAGE}
     * @param component Componente para centralizar a mensagem
     * @param message Mensagem que será exibida
     */
    public static void showWarnMessage(Component component, String message){
        showMessage(component, message, "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
        /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Erro e messageType = {@link JOptionPane#WARNING_MESSAGE}
     * @param component Componente para centralizar a mensagem
     * @param ex Exceção de Sistema com a mensagem de erro
     */
    public static void showMessage(Component component, SistemaException ex){
        showWarnMessage(component, ex.getMessage()+"\n "+ex.getCause().getMessage());
    }
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Erro, component = null e messageType = {@link JOptionPane#ERROR_MESSAGE}
     * @param ex Exceção de Sistema com a mensagem de erro
     */
    public static void showMessage(SistemaException ex){
        showWarnMessage(null, ex.getMessage()+"\n "+ex.getCause().getMessage());
    }

    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Erro, component = null e messageType = {@link JOptionPane#ERROR_MESSAGE}
     * @param message Mensagem que será exibida
     */
    public static void showErrorMessage(String message){
        showWarnMessage(null, message);
    }
    
    /**
     * Inicia um alert padrão do {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}
     * com valores para título = Erro e messageType = {@link JOptionPane#ERROR_MESSAGE}
     * @param component Componente para centralizar a mensagem
     * @param message Mensagem que será exibida
     */
    public static void showErrorMessage(Component component, String message){
        showMessage(component, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
 
    /**
     * Exibe um diálogo de confirmação com opções de sim e não.
     * @param component Componente ao qual será centralizado.
     * @param title Título para exibição
     * @param message Mensagem para exibição
     * @return Verdadeiro caso tenha confirmado.
     */
    public static boolean showConfirma(Component component, String title, String message){
        int value = JOptionPane.showConfirmDialog(component, message, title, JOptionPane.YES_NO_OPTION);
        return value == 0;
    }
    
    /**
     * Exibe uma mensagem de confirmação com o título 'Confirma?'.
     * @see #showConfirma(java.lang.String, java.lang.String) 
     * @param message Mensagem para exibição.
     * @return Verdadeiro caso tenha confirmado.
     */
    public static boolean showConfirma(String message){
        return showConfirma(null, "Confirma?",message);
    }
}
