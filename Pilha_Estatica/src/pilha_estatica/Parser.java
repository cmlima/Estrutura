/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_estatica;

/**
 *
 * @author cmlima
 */
public class Parser {
    
    private static void parse(String expressao) {
        int tamanho = expressao.length();
        PilhaChar pilha = new PilhaChar(tamanho);
        for (int i = 0; i < tamanho; i++) {
            if (expressao.substring(i, i + 1).matches("[\\{\\[\\(]")) {
                pilha.push(expressao.charAt(i));
            } else if (expressao.substring(i, i + 1).matches("[\\)\\]\\}]")) {
                char cToken = expressao.charAt(i);
                if (pilha.isEmpty()) {
                    throw new Error("O token '" + cToken + "' não tem um par");
                }
                char oToken = pilha.pop();
                if (oToken == '(' && cToken != ')' || oToken == '[' && cToken != ']' || oToken == '{' && cToken != '}') {
                    throw new Error("A ordem dos tokens está errada.");
                }
            }
        }
        if (!pilha.isEmpty()) {
            if (pilha.size() == 1) {
                throw new Error("O token '" + pilha.toString() + "' não tem um par");            
            } else {
                throw new Error("Os tokens '" + pilha.toString() + "' não têm um par");
            }
        }
    }
    
    public static void validar(String expressao) {
        try {
            parse(expressao);
            System.out.println("A expressao '" + expressao + "' é válida");
            
        } catch (Error e) {
            System.out.println("A expressao '" + expressao + "' é inválida!");
            System.out.println(e.getMessage());
        }
        
    }
}
