/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_dinamica;

/**
 *
 * @author cmlima
 */
public class Calculadora {
    
    public static double posFixo(String expressao) {
        
        DblStack valores = new DblStack();
        String elementos[] = expressao.split("\\s");
        
        for (String elemento: elementos) {
            if (elemento.matches("\\d+(\\.\\d+)?")) {
                valores.push(Double.parseDouble(elemento));
            } else {
               if (elemento.equals("+")) {
                   valores.push(valores.pop() + valores.pop());
               } 
               if (elemento.equals("-")) {
                   valores.push(valores.pop() - valores.pop());
               } 
               if (elemento.equals("*")) {
                   valores.push(valores.pop() * valores.pop());
               } 
               if (elemento.equals("/")) {
                   valores.push(valores.pop() / valores.pop());
               } 
            }
        }
        
        return valores.pop();
    }
    
    
        
    
}
