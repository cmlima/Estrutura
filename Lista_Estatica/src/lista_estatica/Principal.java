/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_estatica;

/**
 *
 * @author lab801
 */
public class Principal {
    
    public static void testarListaInt() {
        IntList lista = new IntList(10);

        System.out.println(lista.toString());
        
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(70);
        lista.add(80);
        lista.add(90);
        
        System.out.println(lista.toString());
        
        lista.add(35, 2);

        System.out.println(lista.toString());
        
        lista.remove(9);
        lista.remove(8);

        System.out.println(lista.toString());

        lista.remove(4);
        lista.remove(4);

        System.out.println(lista.toString());
        
        System.out.println("Elemento 4: " + lista.get(3));
        System.out.println("Elemento 5: " + lista.get(4));
        System.out.println("Elemento 6: " + lista.get(5));
        System.out.println("Elemento 2: " + lista.get(1));
        System.out.println("Elemento 3: " + lista.get(2));
        System.out.println("Elemento 1: " + lista.get(0));
        
        lista.set(1000, 4);
        System.out.println("Elemento 5: " + lista.get(4));

        System.out.println(lista.toString());
        lista.removeElement(1000);
        System.out.println(lista.toString());    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        testarListaInt();
    }
}