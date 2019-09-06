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
public class CharStack {

    private CharNode peak;
    
    public CharStack() {
        this.peak = null;
    }
    
    public boolean isEmpty() {
        return peak == null;
    }
    
    public void push(char data) {
        CharNode newNode = new CharNode(data);
        CharNode oldNode = this.peak;
        newNode.next = oldNode;
        this.peak = newNode;
    }
    
    public char pop() {
        if (this.isEmpty()) {
            throw new Error("Pilha vazia!");
        }
        CharNode temp = this.peak;
        this.peak = this.peak.next;
        return temp.data;
    }
    
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty");
        } else {
            CharNode present = this.peak;
            while (present != null) {
                present.print();
                present = present.next;
            }
        }
    }
    
}
