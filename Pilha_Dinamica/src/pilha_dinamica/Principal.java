/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_dinamica;

/**
 *
 * @author cmlima
 */
public class Principal {

    public static void testar() {
        IntStack pilha = new IntStack();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Pilha:");
        pilha.print();
        
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando " + pilha.pop());
        }    
    }

    public static void exercicio1() {

        CharStack pilha = new CharStack();
        
        pilha.push('a');
        pilha.push('b');
        pilha.push('c');
        
        System.out.println("Pilha:");
        pilha.print();
        
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando " +  pilha.pop());
        }            
    }

    public static void exercicio2a() {

        DblStack pilha = new DblStack();
        
        pilha.push(1.2);
        pilha.push(10.345);
        pilha.push(102.34);
        
        System.out.println("Pilha:");
        pilha.print();
        
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando " +  pilha.pop());
        }            
    }

    public static void exercicio2b() {
        
        System.out.println(Calculadora.posFixo("2 3 +"));
        System.out.println(Calculadora.posFixo("2 3 5 * +"));
        System.out.println(Calculadora.posFixo("2 3 5 10 / * +"));
        System.out.println(Calculadora.posFixo("2.5 3.7 5.7 10.8 + + +"));

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        testar();
        exercicio1();
        exercicio2a();
        exercicio2b();
        
    }
    
}
