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
public class IntNode {

    public int data;
    public IntNode next;

    public IntNode(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return Integer.toString(this.data);
    }
}
