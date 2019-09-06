/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_circular;

/**
 *
 * @author lab801
 */
public class Principal {

    public static void testar() {
    
        IntQueue fila = new IntQueue(3);
        
        fila.enqueue(10);
        fila.enqueue(15);
        fila.enqueue(20);
        fila.enqueue(25);
        fila.enqueue(30);
        fila.enqueue(35);
        
        System.out.println(fila.toString());
        
        fila.dequeue();
        
        System.out.println(fila.toString());

        fila.enqueue(40);
        fila.enqueue(45);

        System.out.println(fila.toString());
        
        System.out.println(fila.front());
        
        while(!fila.isEmpty()) {
            System.out.println("Dequeuing: " + fila.dequeue());
        }

        System.out.println(fila.toString());        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        testar();
        
    }
    
}
