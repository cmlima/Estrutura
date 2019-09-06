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
public class CharNode {

    public char data;
    public CharNode next;
    
    public CharNode(char dado) {
        this.data = dado;
        next = null;
    }
    
    public void print() {
        System.out.println(this.data);
    }
}
