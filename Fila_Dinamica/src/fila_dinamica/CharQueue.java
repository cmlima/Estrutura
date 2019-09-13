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
public class CharQueue {

    private CharNode head, tail;
    private int size;

    public CharQueue() {
        size = 0;
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public int getSize2() {
        if (this.head == null) {
            return 0;
        }
        int counter = 0;
        CharNode next = this.head;
        while (next != null) {
            counter++;
            next = next.next;
        }
        return counter;
    }

    public void enqueue(char data) {
        CharNode node = new CharNode(data);
        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public char dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        char temp = this.head.data;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return temp;
    }
    
    public char front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        return this.head.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        CharNode node = this.head;
        while (node != null) {
            builder.append(node.data).append(" ");
            node = node.next;
        }
        return builder.toString().trim();
    }
}
