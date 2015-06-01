/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author Claudio
 */
public class FilaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaCirc FC = new FilaCirc ();
        FC.criarFila(5);
        FC.enfileirar(500);
        FC.enfileirar(45);
        FC.enfileirar(2);
        FC.enfileirar(20);
        FC.enfileirar(10);
        FC.desenfileirar();
    }
    
}
