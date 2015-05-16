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
public interface interfacePilhaEncadeada {
    void criarPilha ();
    boolean eVazia ();
    int tamanho ();
    void limpar ();
    NoE push (int valor);
    NoE pop ();
    int pegarTopo ();
    void listar ();
    
}
