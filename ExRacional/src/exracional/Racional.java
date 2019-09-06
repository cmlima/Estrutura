package exracional;

public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
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

    public void soma(Racional r) {
        int denominadorComum = this.denominador * r.getDenominador();
        int numeradorSomado = this.numerador * r.getDenominador() + r.getNumerador() * this.denominador;
        this.setNumerador(numeradorSomado);
        this.setDenominador(denominadorComum);
    }

    public void subtracao(Racional r) {
    }

    public void multiplicao(Racional r) {
    }

    public void divisao(Racional r) {
    }

    @Override
    public String toString() {
        return "Racional: " + this.numerador + "/" + this.denominador;
    }
    
}
