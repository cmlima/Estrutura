/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica;

/**
 *
 * @author lab801
 */
public class Principal {

    public static void testar1() {
        Queue fila = new Queue();
        fila.enqueue(73);
        fila.enqueue(51);
        fila.enqueue(17);
        System.out.println("Fila: " + fila.toString());
        System.out.println("Elemento removido: " + fila.dequeue());
        fila.enqueue(42);
        System.out.println("Fila: " + fila.toString());
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Elemento removido: " + fila.dequeue());
        System.out.println("Fila Vazia? " + fila.isEmpty());
    }
    
    public static void testar2() {
        Queue fila = new Queue();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        System.out.println("Fila: " + fila.toString());
        System.out.println("Tamanho: " + fila.size());
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        System.out.println("Fila: " + fila.toString());
        System.out.println("Tamanho: " + fila.size());
        fila.enqueue(7);
        fila.enqueue(8);
        fila.enqueue(9);
        System.out.println("Fila: " + fila.toString());
        System.out.println("Tamanho: " + fila.size());
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testar1();
        testar2();
    }
    
}
