/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pratica;

/**
 *
 * @author lab801
 */
public class Queue {

    private Stack pilhaPrincipal = new Stack();
    private Stack pilhaAuxiliar = new Stack();

    public boolean isEmpty() {
        return this.pilhaPrincipal.isEmpty();
    }

    public int size() {
        return this.pilhaPrincipal.size();
    }

    private boolean exists(int what) {
        boolean result = false;
        while (!this.pilhaPrincipal.isEmpty()) {
            this.pilhaAuxiliar.push(this.pilhaPrincipal.pop());
        }
        while (!this.pilhaAuxiliar.isEmpty()) {
            if (this.pilhaAuxiliar.top() == what) {
                result = true;
            }
            this.pilhaPrincipal.push(this.pilhaAuxiliar.pop());
        }
        return result;
    }
    
    public void enqueue(int data) {
        if (!this.exists(data)) {
            this.pilhaPrincipal.push(data);
        }
    }
    
    public int dequeue() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        int size = this.size();
        for (int i = 1; i < size; i++) {
            this.pilhaAuxiliar.push(this.pilhaPrincipal.pop());
        }
        int temp = this.pilhaPrincipal.pop();
        while (!this.pilhaAuxiliar.isEmpty()) {
            this.pilhaPrincipal.push(this.pilhaAuxiliar.pop());
        }
        return temp;
    }
    
    public int front() {
        if (this.isEmpty()) {
            throw new Error("A fila está vazia!");
        }
        for (int i = 1; i < this.size(); i++) {
            this.pilhaAuxiliar.push(this.pilhaPrincipal.pop());
        }
        int temp = this.pilhaPrincipal.top();
        while (!this.pilhaAuxiliar.isEmpty()) {
            this.pilhaPrincipal.push(this.pilhaAuxiliar.pop());
        }
        return temp;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        while (!this.pilhaPrincipal.isEmpty()) {
            this.pilhaAuxiliar.push(this.pilhaPrincipal.pop());
        }
        while (!this.pilhaAuxiliar.isEmpty()) {
            builder.append(this.pilhaAuxiliar.top()).append(" ");
            this.pilhaPrincipal.push(this.pilhaAuxiliar.pop());
        }
        return builder.toString().trim();
    }
}
