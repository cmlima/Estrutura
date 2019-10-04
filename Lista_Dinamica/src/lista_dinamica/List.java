/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_dinamica;

/**
 *
 * @author lab801
 */
public class List {

    private Node first;
    private Node last;
    private int size;

    public List() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    public boolean exists(int value) {
        Node node = this.first;
        while (node != null) {
            if (node.data == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    
    public boolean add(int data, int position) {
        if (position > this.size || position < 0) {
            return false;
        }
        Node newNode = new Node(data);
        if (position == 0 && this.isEmpty()) {
            this.first = this.last = newNode;
        } else {
            if (position == 0) {
                newNode.next = this.first;
                this.first = newNode;
            } else {
                if (position == this.size) {
                    this.last.next = newNode;
                    this.last = newNode;
                } else {
                    int counter = 0;
                    Node temp = this.first;
                    while (counter < position - 1) {
                        temp = temp.next;
                        counter++;
                    }
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
            }
        }
        this.size++;
        return true;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (this.isEmpty()) {
            this.first = this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.size++;
    }
    
    public int removeAt(int position) {
        if (this.isEmpty() || position > this.size || position < 0) {
            throw new Error("Posição inválida");
        }
        int temp;
        if (position == 0) {
            temp = this.first.data;
            if (this.size == 1) {
                this.first = this.last = null;
            } else {
                this.first = this.first.next;
            }
        } else {
            int counter = 0;
            Node previous = this.first;
            while (counter < position - 1) {
                previous = previous.next;
                counter++;
            }
            Node removed = previous.next;
            temp = removed.data;
            previous.next = removed.next;
        }
        this.size--;
        return temp;
    }

    public boolean remove(int data) {
        int position = this.indexOf(data);
        if (position > 0) {
            this.removeAt(position);
            return true;
        }
        return false;        
    }

    public boolean set(int data, int position) {
        if (!(this.isEmpty() || position < 0 || position >= this.size)) {
            int counter = 0;
            Node node = this.first;
            while (counter < position) {
                node = node.next;
                counter++;
            }
            node.data = data;
            return true;
        }
        return false;        
    }
    
    public int get(int position) {
        if (this.isEmpty() || position < 0 || position >= this.size) {
            throw new Error("Índice inválido");
        }
        int counter = 0;
        Node node = this.first;
        while (counter < position) {
            node = node.next;
            counter++;
        }
        return node.data;
    }
        
    public int indexOf(int data) {
        int counter = 0;
        Node node = this.first;
        while (node != null) {
            if (node.data == data) {
                return counter;
            }
            counter++;
            node = node.next;
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node node = this.first;
        while (node != null) {
            builder.append(node.data).append(" ");
            node = node.next;
        }
        return builder.toString().trim();
    }
}
