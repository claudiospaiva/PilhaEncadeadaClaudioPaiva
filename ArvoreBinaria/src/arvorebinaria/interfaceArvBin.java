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
public interface interfaceArvBin {
    void printPreOrd();
    void printOrdemInt();
    void printPostOrd();
    void limpar();
    boolean eVazia();
    int tamanho ();
    int height();
    NoArvBin pegarRaiz();
    void fundir();
}
