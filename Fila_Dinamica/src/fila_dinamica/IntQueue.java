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
public class IntQueue {

    private IntNode head, tail;
    private int size;

    public IntQueue() {
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
        IntNode next = this.head;
        while (next != null) {
            counter++;
            next = next.next;
        }
        return counter;
    }

    public void enqueue(int data) {
        IntNode node = new IntNode(data);
        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        int temp = this.head.data;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return temp;
    }
    
    public int front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        return this.head.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        IntNode node = this.head;
        while (node != null) {
            builder.append(node.data).append(" ");
            node = node.next;
        }
        return builder.toString().trim();
    }
}
