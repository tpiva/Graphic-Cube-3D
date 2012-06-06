/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author 08410268
 */
public class Objeto {
    
    private List<Ponto> pontos;
    private List<Linha> linhas;
    
    private void addPonto(Ponto ponto){
        
        pontos.add(ponto);
    }

    private void addLinha(Linha linha){
        
        linhas.add(linha);
    }
}
