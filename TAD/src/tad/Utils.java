/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad;

/**
 *
 * @author lab801
 */
public class Utils {

    public static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }

    
}
