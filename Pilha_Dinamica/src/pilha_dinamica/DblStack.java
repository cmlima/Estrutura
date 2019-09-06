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
public class DblStack {

    private DblNode peak;
    
    public DblStack() {
        this.peak = null;
    }
    
    public boolean isEmpty() {
        return peak == null;
    }
    
    public void push(double data) {
        DblNode newNode = new DblNode(data);
        DblNode oldNode = this.peak;
        newNode.next = oldNode;
        this.peak = newNode;
    }
    
    public double pop() {
        if (this.isEmpty()) {
            throw new Error("Pilha vazia!");
        }
        DblNode temp = this.peak;
        this.peak = this.peak.next;
        return temp.data;
    }
    
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty");
        } else {
            DblNode present = this.peak;
            while (present != null) {
                present.print();
                present = present.next;
            }
        }
    }
    
}
