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
public class IntStack {
    
    private IntNode peak;
    
    public IntStack() {
        this.peak = null;
    }
    
    public boolean isEmpty() {
        return peak == null;
    }
    
    public void push(int data) {
        IntNode newNode = new IntNode(data);
        IntNode oldNode = this.peak;
        newNode.next = oldNode;
        this.peak = newNode;
    }
    
    public int pop() {
        if (this.isEmpty()) {
            throw new Error("Pilha vazia!");
        }
        IntNode temp = this.peak;
        this.peak = this.peak.next;
        return temp.data;
    }
    
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty");
        } else {
            IntNode present = this.peak;
            while (present != null) {
                present.print();
                present = present.next;
            }
        }
    }
    
}
