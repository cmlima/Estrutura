/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_dinamica;

/**
 *
 * @author lab801
 */
public class Principal {

    public static void testarIntQueue() {
        try {
            IntQueue fila = new IntQueue();

            System.out.println(fila.toString());
            fila.enqueue(10);
            fila.enqueue(15);
            fila.enqueue(20);
            fila.enqueue(25);
            fila.enqueue(30);
            fila.enqueue(35);

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            fila.enqueue(40);
            fila.enqueue(45);
            fila.enqueue(50);

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

        } catch (Error e) {
            System.out.println("Fila vazia");
        }
    } 

    public static void testarCharQueue() {
        try {
            CharQueue fila = new CharQueue();

            System.out.println(fila.toString());
            fila.enqueue('a');
            fila.enqueue('b');
            fila.enqueue('c');
            fila.enqueue('d');
            fila.enqueue('e');
            fila.enqueue('f');

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            fila.enqueue('g');
            fila.enqueue('h');
            fila.enqueue('i');

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue());
            System.out.println("Dequeue: " + fila.dequeue());

        } catch (Error e) {
            System.out.println("Fila vazia");
        }
    } 

    public static void testarPersonQueue() {
        try {
            PersonQueue fila = new PersonQueue();

            System.out.println(fila.toString());
            fila.enqueue(new Person("Caio", "1234"));
            fila.enqueue(new Person("A", "BBBB"));
            fila.enqueue(new Person("B", "CCCC"));
            fila.enqueue(new Person("C", "DDDD"));
            fila.enqueue(new Person("D", "EEEE"));
            fila.enqueue(new Person("E", "FFFF"));
            
            System.out.println("Checar senha Caio - 1234: " + fila.front().checkPassword("1234"));
            System.out.println("Checar senha Caio - 4321: " + fila.front().checkPassword("4321"));

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front().toString());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front().toString());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            fila.enqueue(new Person("F", "GGGG"));
            fila.enqueue(new Person("G", "HHHH"));
            fila.enqueue(new Person("H", "IIII"));

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front().toString());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front().toString());

            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());

            System.out.println(fila.toString());
            System.out.println("Front: " + fila.front().toString());
            System.out.println("Tamanho: " + fila.getSize());
            System.out.println("Tamanho: " + fila.getSize2());

            System.out.println("Dequeue: " + fila.dequeue().toString());
            System.out.println("Dequeue: " + fila.dequeue().toString());

        } catch (Error e) {
            System.out.println("Fila vazia");
        }
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testarIntQueue();
        //testarCharQueue();
        testarPersonQueue();
        
    }
}
