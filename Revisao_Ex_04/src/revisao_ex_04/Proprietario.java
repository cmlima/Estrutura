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
public class Proprietario {
    private String nome;
    private String telefone;
    private Animal animal;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void atribuirAnimal(String nome, String raca, String cor, int anoDeNascimento) {
        this.animal = new Animal(nome, raca, cor, anoDeNascimento, this);
    }

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", telefone=" + telefone + ", animal=" + animal + '}';
    }
    
}
