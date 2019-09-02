/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_03;

/**
 *
 * @author lab801
 */
public class Equacao {
    
    private double a;
    private double b;
    private double c;

    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        if (a == 0) {
            throw new Error ("O valor de a deve ser diferente de zero!");
        }
    }
    
    private double delta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c); 
    }
    
    private double primeiraRaiz(double d) {
        return (this.b * -1 + Math.sqrt(d)) / (2 * this.a);
    }

    private double segundaRaiz(double d) {
        return (this.b * -1 - Math.sqrt(d)) / (2 * this.a);
    }
    
    public void raizes() {
        double d = this.delta();
        if (d < 0) {
            System.out.println("Não há raízes para essa equação.");
        } else if (d == 0) {
            System.out.println("A raiz da equação é " + this.primeiraRaiz(d));
        } else {
            System.out.println("As raízes da equação são " + this.primeiraRaiz(d) + " e " + this.segundaRaiz(d));
        }
    }
}
