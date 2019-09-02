/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_05;

/**
 *
 * @author lab801
 */
public class Trapezio {
    private double b;
    private double B;
    private double h;

    public Trapezio(double baseMenor, double baseMaior, double altura) {
        this.b = baseMenor;
        this.B = baseMaior;
        this.h = altura;
    }
    
    public double area() {
        return ((this.b + this.B) * this.h) / 2;
    }
    
}
