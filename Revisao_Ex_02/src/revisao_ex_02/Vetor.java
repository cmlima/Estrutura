/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_02;

/**
 *
 * @author lab801
 */
public class Vetor {
    
    private int vetor[];

    public Vetor(int tamanho) {
        int temp[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp[i] = 3 * i - 1;
        }
        this.vetor = temp;
    }
    
    public double media() {
        int soma = 0;
        int tamanho = this.vetor.length;
        
        for (int i = 0; i < tamanho; i++) {
            soma += this.vetor[i];
        }
        
        return soma / tamanho;
    }
    
}
