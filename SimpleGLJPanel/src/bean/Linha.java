/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.Color;

/**
 *
 * @author 08410268
 */
public class Linha {
    public Ponto ponto1;
    public Ponto ponto2;  
    public Color cor;

    public Linha(Ponto ponto1, Ponto ponto2, Color cor) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.cor = cor;
    }

    public Linha() {
    }
    
    
    /**
     * @return the ponto1
     */
    public Ponto getPonto1() {
        return ponto1;
    }

    /**
     * @param ponto1 the ponto1 to set
     */
    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    /**
     * @return the ponto2
     */
    public Ponto getPonto2() {
        return ponto2;
    }

    /**
     * @param ponto2 the ponto2 to set
     */
    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    /*
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }
    
    
    
}
