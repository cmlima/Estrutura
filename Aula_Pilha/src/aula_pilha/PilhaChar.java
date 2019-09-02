/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_pilha;

/**
 *
 * @author lab801
 */
public class PilhaChar {

    private int topo;
    private final char[] vetor;

    public PilhaChar(int quantidade) {
        this.topo = 0;
        this.vetor = new char[quantidade];
    }
    
    public boolean isFull() {
        return this.topo == this.vetor.length;
    }
    
    public boolean isEmpty() {
        return this.topo == 0;
    }
    
    public int size() {
        return this.topo;
    }
    
    public char peek() {
        if (this.isEmpty()) {
            throw new Error("Vetor vazio!");
        }
        return this.vetor[this.topo - 1];
    }
    
    public boolean push(char dado) {
        if (this.isFull()) {
            return false;
        }
        this.vetor[this.topo] = dado;
        this.topo++;
        return true;
    }
    
    public char pop() {
        if (this.isEmpty()) {
            throw new Error("A pilha está vazia");
        }
        this.topo--;
        return this.vetor[this.topo]; 
    }
    
    public void clear() {
        this.topo = 0;
    }

    @Override
    public String toString() {
        String s = "";
        if (this.isEmpty()) {
            return "[]";
        }
        for (int i = 0; i < this.topo; i++) {
            s += this.vetor[i] + ", ";
        }
        return "[ " + s.substring(0, s.length() - 2) + " ]";
    }
    
    
    
}
