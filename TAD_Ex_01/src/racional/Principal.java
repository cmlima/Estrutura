/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author lab801
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Racional numero1 = new Racional(12, 3);
        Racional numero2 = new Racional(4, 4);
        
        numero1.subtracao(numero2);
        
        System.out.println(numero1.toString());
    }
    
}
