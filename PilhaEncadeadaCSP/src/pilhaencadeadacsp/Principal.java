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
        x.listar();
        x.pop();
        System.out.println();
        x.listar();
        x.pop();
        x.listar();
        x.pop();
        x.listar();
        x.pop();
        x.listar();
    }
}
