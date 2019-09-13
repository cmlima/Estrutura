/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila_dinamica;

/**
 *
 * @author cmlima
 */
public class Person {
    
    private String name, password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public boolean checkPassword(String sample) {
        return sample.equals(this.password);
    }
    
    @Override
    public String toString() {
        return this.name;
    }        
}
