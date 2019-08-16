/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_01;

/**
 *
 * @author lab801
 */
public class Aluno {

    private double peso;
    private double altura;
    private char sexo;

    public Aluno(double peso, double altura, char sexo) {
        this.peso = peso;
        this.altura = altura;
        this.setSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = (sexo == 'M' || sexo == 'm') ? 'M' : 'F';
    }
    
    public void mostrar() {
        System.out.println(this.toString());
    }
    
    public double pesoIdeal() {
        return this.sexo == 'M' ? (72.7 * this.altura) - 58 : (62.1 * this.altura) - 44.7;
    }

    @Override
    public String toString() {
        return "Aluno{" + "peso=" + peso + ", altura=" + altura + ", sexo=" + this.sexo + "}";
    }
    
}
