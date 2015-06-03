/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author Claudio
 */
public class NoArvBin {
    
    private Object elemento;
    private NoArvBin Esq;
    private NoArvBin Dir;

    public NoArvBin() {
        
    }
    
    public NoArvBin (Object theElement,  NoArvBin esq, NoArvBin dir) {
        elemento = theElement;
        Esq = esq;
        Dir = dir;
    }
    
    public static int tamanho ( NoArvBin NoAB ) 
    {
        if (NoAB==null) {
            return 0;
        }
        else {
            return 1 + tamanho(NoAB.Esq) + tamanho (NoAB.Dir);
        }
    }
    public static int height (NoArvBin NoAB) {
        if (NoAB == null) {
            return -1;
        }
        else {
            return 1 + Math.max(height (NoAB.Esq), height (NoAB.Dir)); 
            
        }
    }
    public void printPreOrd () {
        
    }
    public void printPostOrd () {
        
    }
    
    
}
