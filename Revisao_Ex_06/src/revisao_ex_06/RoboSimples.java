/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_ex_06;

/**
 *
 * @author lab801
 */
public class RoboSimples {
    
    private String direcao = "N";
    
    public void setdirecao(String d) {
    }

    public void setDirecao(String direcao) {
        if (direcao != "N" && direcao != "S" && direcao != "L" && direcao != "O") {
            this.direcao = "N";
        } else {
            this.direcao = direcao;
        }
    }

    public String getDirecao() {
        return this.direcao;
    }
    
}
