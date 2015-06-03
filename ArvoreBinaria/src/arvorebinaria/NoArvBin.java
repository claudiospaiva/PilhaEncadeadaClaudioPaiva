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
        this(null, null, null);
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
        System.out.println(elemento);
        if ( Esq != null) {
            Esq.printPreOrd();
        }
        if ( Dir != null) {
            Dir.printPreOrd();
        }
    }
    public void printPostOrd () {
        if ( Esq != null) {
            Esq.printPostOrd();
        }
        if ( Dir != null) {
            Dir.printPostOrd();
        }
        System.out.println(elemento);
    }
    
    public void printOrdemInt () {
        if ( Esq != null) {
            Esq.printOrdemInt();
        }
        System.out.println(elemento);
        if ( Dir != null) {
            Dir.printOrdemInt();
        }
        
    }
    public NoArvBin duplicar () {
        NoArvBin raiz = new NoArvBin (elemento, null, null);
        
        if (Esq != null) //se existe uma sub-árvore (à Esquerda)
        {
            raiz.Esq = Esq.duplicar();
        }
        if (Esq != null) {
            raiz.Dir = Dir.duplicar();
        }
        return raiz; //retorne a árvore resultante!
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoArvBin getEsq() {
        return Esq;
    }

    public void setEsq(NoArvBin Esq) {
        this.Esq = Esq;
    }

    public NoArvBin getDir() {
        return Dir;
    }

    public void setDir(NoArvBin Dir) {
        this.Dir = Dir;
    }
 
    
    
    
}
