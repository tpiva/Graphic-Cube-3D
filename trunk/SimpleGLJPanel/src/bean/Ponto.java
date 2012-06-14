/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 08410268
 */
public class Ponto {
    
    public String nomePonto;
    public double coordenada_x;
    public double coordenada_y;
    public double coordenada_z;
    
    public Ponto(){}

    public Ponto(String nomePonto, double coordenada_x, double coordenada_y, double coordenada_z) {
        this.nomePonto = nomePonto;
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.coordenada_z = coordenada_z;
    }    

    public double getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(double coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public double getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(double coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public double getCoordenada_z() {
        return coordenada_z;
    }

    public void setCoordenada_z(double coordenada_z) {
        this.coordenada_z = coordenada_z;
    }

    public String getNomePonto() {
        return nomePonto;
    }

    public void setNomePonto(String nomePonto) {
        this.nomePonto = nomePonto;
    }
        
}
