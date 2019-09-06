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
public class Colecao {
    
    private char dados[];
    private int numElementos;

    public Colecao(int tamanho) {
        dados = new char[tamanho];
        this.numElementos = 0;
    }
    
    public int buscar(char chave) {
        for (int i = 0; i < this.numElementos; i++) {
            if (this.dados[i] == chave) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean inserir(char novoElemento) {
        if (this.numElementos < this.dados.length) {
            this.dados[this.numElementos] = novoElemento;
            this.numElementos++;
            return true;
        }
        return false;
    }
    
    public boolean deletar(char chave) {
        int index = this.buscar(chave);
        if (index < 0) {
            return false;
        }
        for (int i = index; i < this.numElementos - 1; i++) {
            this.dados[i] = this.dados[i + 1];
        }
        this.numElementos--;
        return true;
    }

    public void imprimir() {
        for (int i = 0; i < this.numElementos; i++) {
            System.out.println(dados[i] + " ");
        }
        System.out.println("");
    }
    
}
