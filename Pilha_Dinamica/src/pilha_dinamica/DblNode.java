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
public class DblNode {

    public double data;
    public DblNode next;
    
    public DblNode(double dado) {
        this.data = dado;
        next = null;
    }
    
    public void print() {
        System.out.println(this.data);
    }
    
}
