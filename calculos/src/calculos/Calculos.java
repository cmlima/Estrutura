
package calculos;

import java.util.Scanner;


public class Calculos {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.println("1- liga 2-desliga");
        c.botaoLiga = scan.nextInt();
        if(c.botaoLiga==1){
        c.LigaDesliga();
        System.out.println("Canal 0");
        System.out.println("Volume 0");
        System.out.println("1-aumentar canal 2-baixar canal:");
        c.canal = scan.nextInt();
        System.out.println("Canal: " + c.Canal());
        System.out.println("1-Aumentar volume 2-Baixar volume:");
        c.volume = scan.nextInt();
        System.out.println("Volume:" + c.Volume());
        }
        else{
            System.out.println("Tv desligada !!");
        }
        
    }
    
}
