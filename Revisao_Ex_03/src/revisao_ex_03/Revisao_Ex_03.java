/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_03;

/**
 *
 * @author lab801
 */
public class Revisao_Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equacao equacao1 = new Equacao(1, -2, -3);
        Equacao equacao2 = new Equacao(1, 8, 16);
        Equacao equacao3 = new Equacao(10, 6, 10);
        
        equacao1.raizes();
        equacao2.raizes();
        equacao3.raizes();
    }
    
}
