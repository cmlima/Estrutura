/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_dinamica;

/**
 *
 * @author lab801
 */
public class Principal {

    
    public static void testar() {
        List lista = new List();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Lista: " + lista.toString());
        System.out.println("Posição de 3: " + lista.indexOf(3));
        System.out.println("Posição de 1: " + lista.indexOf(1));
        System.out.println("Posição de 5: " + lista.indexOf(5));
        System.out.println("Tamanho: " + lista.getSize());
        System.out.println("Removido posição 2: " + lista.removeAt(2));
        System.out.println("Lista: " + lista.toString());
        System.out.println("Tamanho: " + lista.getSize());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testar();
    }
    
}
