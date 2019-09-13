package calculos;

public class Calculadora {

    public int botaoLiga;
    public int canal;
    public int volume;
    int valor;
    int valor1;

    public boolean LigaDesliga() {
        if (this.botaoLiga == 1) {
            System.out.println("Ligando...");
            return true;
        } else {
            System.out.println("Desligando...");
            return false;
        }

    }

    public int Canal() {
        do {
            
            if (this.canal == 1) {
                valor = valor + 1;
            } else {
                valor = valor - 1;
            }
        } while (this.canal >= 1 && this.canal <= 2);
        return valor;
    }

    public int Volume() {
        do {
            System.out.println("Batata!");
            if (this.volume == 1) {
                valor1 = valor1 + 1;

            } else {
                valor1 = valor1 - 1;
            }

        } while (this.volume >= 1 && this.volume <= 2);
        return valor1;
    }
}
