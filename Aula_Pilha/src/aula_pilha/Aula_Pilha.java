/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pilha;

//import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lab801
 */
public class Aula_Pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        PilhaInt pilha = new PilhaInt(10);
//        Random gerador = new Random();
//        
//        System.out.println("isEmpty: " + pilha.isEmpty());
//        System.out.println("isFull: " + pilha.isFull());
//        System.out.println("size: " + pilha.size());
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("size: " + pilha.size());
//        System.out.println("isFull: " + pilha.isFull());
//        System.out.println("peek: " + pilha.peek());
//        System.out.println(pilha.toString());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println(pilha.toString());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("pop: " + pilha.pop());
//        System.out.println("size: " + pilha.size());
//        System.out.println(pilha.toString());
//        System.out.println("isEmpty: " + pilha.isEmpty());
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println("push: " + pilha.push(gerador.nextInt(1000)));
//        System.out.println(pilha.toString());
//        System.out.println("clear");
//        pilha.clear();
//        System.out.println(pilha.toString());
//        
//        PilhaChar pilha2 = new PilhaChar(10);
//        
//        System.out.println("isEmpty: " + pilha2.isEmpty());
//        System.out.println("isFull: " + pilha2.isFull());
//        System.out.println("size: " + pilha2.size());
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("size: " + pilha2.size());
//        System.out.println("isFull: " + pilha2.isFull());
//        System.out.println("peek: " + pilha2.peek());
//        System.out.println(pilha2.toString());
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println(pilha2.toString());
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("pop: " + (char)(pilha2.pop()));
//        System.out.println("size: " + pilha2.size());
//        System.out.println(pilha2.toString());
//        System.out.println("isEmpty: " + pilha2.isEmpty());
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println("push: " + pilha2.push((char)(gerador.nextInt(256))));
//        System.out.println(pilha2.toString());
//        System.out.println("clear");
//        pilha2.clear();
//        System.out.println(pilha2.toString());

        Scanner entrada = new Scanner(System.in);
        String s;
        
        System.out.println("Digite algo: ");
        s = entrada.nextLine();
        int tamanho = s.length();
        PilhaChar pilha = new PilhaChar(tamanho);
        for (int i = 0; i < tamanho; i++) {
            pilha.push(s.charAt(i));
        }
        s = "";
        for (int i = 0; i < tamanho; i++) {
            s += pilha.pop();
        }
        
        System.out.println(s);
    }
    
}
