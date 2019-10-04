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
public class Stack {
    
    private Node peak;
    
    public Stack() {
        this.peak = null;
    }
    
    public boolean isEmpty() {
        return peak == null;
    }
    
    public void push(int data) {
        Node newNode = new Node(data);
        Node oldNode = this.peak;
        newNode.next = oldNode;
        this.peak = newNode;
    }
    
    public int pop() {
        if (this.isEmpty()) {
            throw new Error("Pilha vazia!");
        }
        Node temp = this.peak;
        this.peak = this.peak.next;
        return temp.data;
    }

    public int size() {
      if (this.peak == null) {
            return 0;
        }
        int counter = 0;
        Node next = this.peak;
        while (next != null) {
            counter++;
            next = next.next;
        }
        return counter;
    }
    
    public int top() {
        if (this.isEmpty()) {
            throw new Error("Pilha vazia!");
        }
        return this.peak.data;
    }    
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();            
            Node present = this.peak;
            while (present != null) {
                builder.append(present.data).append(" ");
                present = present.next;
            }
            return builder.toString().trim();
        }
    }
}
