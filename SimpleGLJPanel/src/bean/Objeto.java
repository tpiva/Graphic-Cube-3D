/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 08410268
 */
public class Objeto {    
    
    public List<Linha> linhas ;  
    public List<Ponto> pontos ;
    
    public void addLinha(Linha linha){
        if(this.linhas ==null)
        {
            linhas = new LinkedList<Linha>();            
        }
        linhas.add(linha);
    }
    
    public void addPonto(Ponto ponto){
        if(this.pontos ==null)
        {
            pontos = new LinkedList<Ponto>();            
        }
        pontos.add(ponto);
    }
}
