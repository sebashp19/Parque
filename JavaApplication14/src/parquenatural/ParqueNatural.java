/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

import javax.swing.JOptionPane;
/**
 *
 * @author SIS
 */
public class ParqueNatural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("1: Crear parque \n 2: Gestionar parque \n 3: Visitar parque"));
        }while(op>4||op<1);
        
    }
    
}
