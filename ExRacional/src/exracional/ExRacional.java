package exracional;

public class ExRacional {

    public static void main(String[] args) {
        
        Racional r1 = new Racional(3,4);
        Racional r2 = new Racional(2,5);
        
        r1.soma(r2);
        System.out.println(r1);
        
        r1.subtracao(r2);
        System.out.println(r1);
        
        r1.multiplicao(r2);
        System.out.println(r1);
        
        r1.divisao(r2);
        System.out.println(r1);
        
    }
    
}
