/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_estatica;

/**
 *
 * @author lab801
 */
public class IntQueue {

    private int queue[];
    private int head, tail;

    public IntQueue(int size) {
        this.queue = new int[size];
        this.head = this.tail = 0;
    }

    public boolean isEmpty() {
        return this.head == 0 && this.tail == 0;
    }

    public boolean isFull() {
        return this.tail == this.queue.length;
    }

    public boolean enqueue(int data) {
        if (this.isFull()) {
            return false;
        }
        this.queue[this.tail++] = data;
        return true;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        int temp = this.queue[this.head];
        for (int i = 1; i < this.tail; i++) {
            this.queue[i - 1] = this.queue[i];
        }
        this.tail--;
        return temp;
    }
    
    public int front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        return this.queue[this.head];
    }
    
    public int size() {
        return this.tail - this.head;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.tail; i++) {
            output.append(this.queue[i]).append(" ");
        }
        return output.toString().trim();
    }
}
