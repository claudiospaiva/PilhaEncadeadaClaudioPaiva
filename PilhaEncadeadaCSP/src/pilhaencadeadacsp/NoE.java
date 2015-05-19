/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaencadeadacsp;

/**
 *
 * @author Claudio
 */
public class NoE {
    private int valor;
    private NoE Next;

    public NoE() {
       
    }
    
    public NoE(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNext(NoE Next) {
        this.Next = Next;
    }

    public NoE getNext() {
        return Next;
    }
    
    
}
