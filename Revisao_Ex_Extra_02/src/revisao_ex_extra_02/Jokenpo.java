/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_extra_02;

import javax.swing.JOptionPane;

/**
 *
 * @author cmlima
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String p1 = JOptionPane.showInputDialog("Digite a jogada do primeiro");
        String p2 = JOptionPane.showInputDialog("Digite a jogada do segundo");
        if (p1.equalsIgnoreCase(p2)) {
            JOptionPane.showMessageDialog(null, "Empate");
        } else if ((p1.equalsIgnoreCase("pedra") && p2.equalsIgnoreCase("tesoura"))
                || (p1.equalsIgnoreCase("tesoura") && p2.equalsIgnoreCase("papel"))
                || (p1.equalsIgnoreCase("papel") && p2.equalsIgnoreCase("pedra"))) {
            JOptionPane.showMessageDialog(null, "Primeiro jogador é vencedor");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo jogador é vencedor");
        }
    }

}
