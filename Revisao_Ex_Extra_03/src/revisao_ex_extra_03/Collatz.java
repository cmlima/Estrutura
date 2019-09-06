/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_extra_03;

/**
 *
 * @author cmlima
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long maior = 0, valor = 0;
        for (int n = 1; n <= 1000000; n++) {
            long i = n;
            long contador = 0;
            while (i > 1) {
                System.out.print(i + " -> ");
                contador++;
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    i = 3 * i + 1;
                }

            }
            System.out.print(i);
            contador++;
            System.out.println();
            if (contador > maior) {
                maior = contador;
                valor = n;
            }
        }
        System.out.println();
        System.out.println("O valor que gera maior sequência é " + valor + " com " + maior + " números");
    }
}
