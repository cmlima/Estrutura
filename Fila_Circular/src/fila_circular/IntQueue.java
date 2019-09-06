/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_circular;

/**
 *
 * @author lab801
 */
public class IntQueue {

    private int queue[];
    private int head, tail, size;

    public IntQueue(int size) {
        this.queue = new int[size];
        this.head = this.tail = this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.queue.length;
    }

    public boolean enqueue(int data) {
        if (this.isFull()) {
            return false;
        }
        this.queue[this.tail] = data;
        this.tail = (++this.tail) % this.queue.length;
        this.size++;
        return true;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        int temp = this.queue[this.head];
        this.head = (++this.head) % this.queue.length;
        this.size--;
        return temp;
    }
    
    public int front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        return this.queue[this.head];
    }
    
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        int posicao = this.head;
        int contador = this.size;
        while (posicao != this.tail || contador > 0) {
            output.append(this.queue[posicao]).append(" ");
            posicao = (++posicao) % this.queue.length;
            contador--;
        }
        return output.toString().trim();
    }
    
}