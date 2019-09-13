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
public class PersonNode {

    public Person data;
    public PersonNode next;

    public PersonNode(Person person) {
        this.data = person;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
