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
public class Principal {
    
    public static void main(String[] args) {
        PilhaEnc x = new PilhaEnc();
        x.push(2);
        x.push(0);
        x.push(5);
        x.push(11);
        
        x.listar();
        System.out.println("O tamanho da pilha é: " + x.getTamanho());
        
        x.pop();
        
        x.listar();
        System.out.println("O novo tamanho da pilha é: " + x.getTamanho());
        
        x.pop();
        
        x.listar();
        System.out.println("O novo tamanho da pilha é: " + x.getTamanho());
        
        x.pop();
        
        x.listar();
        System.out.println("O novo tamanho da pilha é: " + x.getTamanho());
        
        x.pop();
        
        x.listar();
        System.out.println("O novo tamanho da pilha é: " + x.getTamanho());
    }
}
