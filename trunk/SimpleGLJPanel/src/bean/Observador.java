/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 08410268
 */
public class Observador {
    
    private Ponto ponto_observador;
    private Ponto ponto_z_observador;
    private float distancia_tela;

    /**
     * @return the ponto_observador
     */
    public Ponto getPonto_observador() {
        return ponto_observador;
    }

    /**
     * @param ponto_observador the ponto_observador to set
     */
    public void setPonto_observador(Ponto ponto_observador) {
        this.ponto_observador = ponto_observador;
    }

    /**
     * @return the ponto_z_observador
     */
    public Ponto getPonto_z_observador() {
        return ponto_z_observador;
    }

    /**
     * @param ponto_z_observador the ponto_z_observador to set
     */
    public void setPonto_z_observador(Ponto ponto_z_observador) {
        this.ponto_z_observador = ponto_z_observador;
    }

    /**
     * @return the distancia_tela
     */
    public float getDistancia_tela() {
        return distancia_tela;
    }

    /**
     * @param distancia_tela the distancia_tela to set
     */
    public void setDistancia_tela(float distancia_tela) {
        this.distancia_tela = distancia_tela;
    }
    
    
}
