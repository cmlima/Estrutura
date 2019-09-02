/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_04;

/**
 *
 * @author lab801
 */
public class Revisao_Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Proprietario proprietario = new Proprietario("Fulano de Tal", "11-3333-22222");
        proprietario.atribuirAnimal("Rex", "Bull Dog", "marrom", 2015);
        System.out.println(proprietario.toString());
    }
    
}
