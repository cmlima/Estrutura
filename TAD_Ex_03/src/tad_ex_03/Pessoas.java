/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_ex_03;

/**
 *
 * @author cmlima
 */
public class Pessoas {

    private Pessoa lista[];
    private int numElementos;

    public Pessoas() {
        lista = new Pessoa[10];
        this.numElementos = 0;
    }
    
    public int buscar(String nome) {
        for (int i = 0; i < this.numElementos; i++) {
            if (this.lista[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
    
    public String buscarEndereco(String nome) {
        int index = this.buscar(nome);
        if (index >= 0) {
            return this.lista[index].getEndereco();
        }
        return "Pessoa não localizada";
    }
    
    public void cadastrar(String nome, String endereco) {
        if (this.numElementos < this.lista.length) {
            this.lista[this.numElementos] = new Pessoa(nome, endereco);
        } else {
            Pessoa temp[] = new Pessoa[this.numElementos + 1];
            for (int i = 0; i < this.numElementos; i++) {
                temp[i] = this.lista[i];
            }
            temp[this.numElementos] = new Pessoa(nome, endereco);
        }
        this.numElementos++;
    }
    
    public boolean deletar(String nome) {
        int index = this.buscar(nome);
        if (index < 0) {
            return false;
        }
        for (int i = index; i < this.numElementos - 1; i++) {
            this.lista[i] = this.lista[i + 1];
        }
        this.numElementos--;
        return true;
    }

    public void imprimir() {
        for (int i = 0; i < this.numElementos; i++) {
            System.out.println(this.lista[i].getNome() + " ");
        }
        System.out.println("");
    }
    
}
