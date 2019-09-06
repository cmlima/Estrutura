/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author lab801
 */
public class Racional {
    
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.simplificar();
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    private void simplificar() {
        int mdc = Utils.mdc(this.numerador, this.denominador);
        this.numerador = this.numerador / mdc;
        this.denominador = this.numerador == 0 ? 1 : this.denominador / mdc;
    }
    
    public void subtracao(Racional numero) {
        int novoDenominador = Utils.mmc(this.denominador, numero.denominador);        
        int novoNumerador = ((novoDenominador/this.denominador)*this.numerador);
        novoNumerador -= ((novoDenominador/numero.denominador)*numero.numerador);
        this.numerador = novoNumerador;
        this.denominador = novoDenominador;
        this.simplificar();
    }

    public void soma(Racional numero) {
        int novoDenominador = Utils.mmc(this.denominador, numero.denominador);
        int novoNumerador = ((novoDenominador/this.denominador)*this.numerador);
        novoNumerador += ((novoDenominador/numero.denominador)*numero.numerador);
        this.numerador = novoNumerador;
        this.denominador = novoDenominador;
        this.simplificar();
    }
    
    public void multiplicacao(Racional numero) {
        this.numerador *= numero.numerador;
        this.denominador *= numero.denominador;
    }

    public void divisao(Racional numero) {
        this.numerador *= numero.denominador;
        this.denominador *= numero.numerador;
    }

    @Override
    public String toString() {
        return "Racional{" + "numerador=" + this.numerador + ", denominador=" + this.denominador + '}';
    }
    
    
    
}
