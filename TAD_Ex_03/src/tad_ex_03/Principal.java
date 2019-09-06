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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoas pessoas = new Pessoas();
        
        pessoas.cadastrar("Caio", "Rua Afonso de Freitas");
        pessoas.cadastrar("Eliane", "Rua Fulano de Tal");
        pessoas.cadastrar("Thiago", "Avenida Angélica");
        pessoas.cadastrar("Jayme", "Rua Indiana");
        pessoas.cadastrar("Sandra", "Rua Indiana");
        
        pessoas.imprimir();
        
        pessoas.deletar("Jayme");
        
        pessoas.imprimir();

        System.out.println(pessoas.buscarEndereco("Caio"));
        System.out.println(pessoas.buscarEndereco("Jayme"));
        System.out.println(pessoas.buscarEndereco("Thiago"));
        System.out.println(pessoas.buscarEndereco("Sandra"));
        System.out.println(pessoas.buscarEndereco("Eliane"));
    }
    
}
