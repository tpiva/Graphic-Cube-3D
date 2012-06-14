/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 08410268
 */
public class Arquivo {

    private BufferedReader in;
    private String nomeArquivo = null;

    private void abreArquivo() {
        try {
            in = new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException ex) {
            System.err.println("Erro ao abrir arquivo");
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fechaArquivo() {
        try {
            in.close();
        } catch (IOException ex) {
            System.err.println("Erro ao fechar arquivo");
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getLinha() {
        String str = "";
        try {

            if (in == null) {
                this.abreArquivo();
            } 
            
            str = in.readLine();

        } catch (IOException ex) {
            System.err.println("Erro ao ler arquivo");
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return str;
    }

    /**
     * @param nomeArquivo the nomeArquivo to set
     */
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    } 
    
}
