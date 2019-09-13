
package calculadora;

import java.util.Locale;
import java.util.Scanner;

class Calculadora {

   
    public static void main(String[] args) {
        double num1,num2,resu;
        String digitado;
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num1 = scan.nextDouble();
        System.out.println("Digite a operação: + / - / * / ^/ / :");
        digitado = scan.nextLine();
        System.out.println("Digite outro valor: ");
        num2 = scan.nextDouble();
        
       
        switch (digitado.charAt(0)) { // primeiro entra com a string e dps charAt(o) na posicao 0
            case '+':System.out.println("Resultado: " + (num1+num2));break;
            case '-':System.out.println("Resultado: " + (num1-num2));break;
            case '*':System.out.println("Resultado: " + (num1*num2));break;
            case '/':System.out.println("Resultado: " + (num1/num2));break;
            default:System.out.println("Resultado: " + (Math.pow(num1,num2)));break;
        }
    }
    
}
