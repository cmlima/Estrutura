/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_ex_02;

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
        
        int tamanho = 5;
        
        Colecao col = new Colecao(tamanho);
        
        col.inserir('a');
        col.inserir('b');
        col.inserir('c');
        col.inserir('d');
        col.inserir('e');
        col.inserir('f');
        
        col.imprimir();
        
        if (col.buscar('a') >= 0) {
            System.out.println("Encontrou a");
        } else {
            System.out.println("Não encontrou a");
        }

        col.deletar('a');
        col.imprimir();
        
        if (col.buscar('a') >= 0) {
            System.out.println("Encontrou a");
        } else {
            System.out.println("Não encontrou a");
        }
        
    }
}
