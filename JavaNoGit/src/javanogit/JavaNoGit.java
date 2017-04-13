/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanogit;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JavaNoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "Mensagem de teste - CONTROLE DE VERSÃO";              
        JOptionPane.showMessageDialog(null, msg);
        
        String msg2 = "Calculando a soma de dois números: ";
        JOptionPane.showMessageDialog(null, msg2);
        
        int num1 = 8;
        int num2 = 5;
        System.out.println("Resultado da Soma = " + (num1+num2));
        
        System.out.println("COM COMMIT DE CALCULO DE SOMA");
        
    }
    
}
