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
public class Pessoa {
    
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
