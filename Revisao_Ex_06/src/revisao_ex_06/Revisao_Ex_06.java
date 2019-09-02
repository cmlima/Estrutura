/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_06;

/**
 *
 * @author lab801
 */
public class Revisao_Ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RoboSimples robo = new RoboSimples();
        
        System.out.println("Direcao inicial: " + robo.getDirecao());
        robo.setDirecao("S");
        System.out.println("Direcao atual: " + robo.getDirecao());
        robo.setDirecao("L");
        System.out.println("Direcao atual: " + robo.getDirecao());
        robo.setDirecao("O");
        System.out.println("Direcao atual: " + robo.getDirecao());
        robo.setDirecao("N");
        System.out.println("Direcao atual: " + robo.getDirecao());
        robo.setDirecao("Z");
        System.out.println("Direcao atual: " + robo.getDirecao());
    }
    
}
