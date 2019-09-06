/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_extra_04;

import javax.swing.JOptionPane;

/**
 *
 * @author cmlima
 */
public class Lampadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantLampadas = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de lâmpadas ?"));
        boolean lampadas[] = new boolean[quantLampadas];
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = false;
        }
        for (int i = 1; i <= quantLampadas; i++) {
            for (int j = 0; j < lampadas.length; j++) {
                if ((j + 1) % i == 0) {
                    lampadas[j] = !lampadas[j];
                }
            }
        }

        String saida = "[";
        for (int i = 0; i < lampadas.length; i++) {
            if (i == lampadas.length - 1) {
                if (lampadas[i]) {
                    saida += "on";
                } else {
                    saida += "off";
                }
            } else {
                if (lampadas[i]) {
                    saida += "on, ";
                } else {
                    saida += "off, ";
                }
            }
        }
        saida += "]";
        JOptionPane.showMessageDialog(null, saida);
    }

}
