/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_04;

/**
 *
 * @author lab801
 */
public class Animal {

    private final String nome;
    private final String raca;
    private final String cor;
    private final int anoDeNascimento;
    private final Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int anoDeNascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoDeNascimento = anoDeNascimento;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", raca=" + raca + ", cor=" + cor + ", anoDeNascimento=" + anoDeNascimento + '}';
    }
    
}
