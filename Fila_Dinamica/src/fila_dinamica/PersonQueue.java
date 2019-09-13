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
public class PersonQueue {

    private PersonNode head, tail;
    private int size;

    public PersonQueue() {
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
        PersonNode next = this.head;
        while (next != null) {
            counter++;
            next = next.next;
        }
        return counter;
    }

    public void enqueue(Person data) {
        PersonNode node = new PersonNode(data);
        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public Person dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        Person temp = this.head.data;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return temp;
    }
    
    public Person front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        return this.head.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        PersonNode node = this.head;
        while (node != null) {
            builder.append(node.data.toString()).append(" ");
            node = node.next;
        }
        return builder.toString().trim();
    }
}
