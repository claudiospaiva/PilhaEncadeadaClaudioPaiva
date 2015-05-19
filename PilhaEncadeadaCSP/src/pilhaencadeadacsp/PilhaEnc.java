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
public class PilhaEnc implements interfacePilhaEncadeada {
    
    private NoE topo;
    private NoE fim;
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
    @Override
    public void criarPilha() {
        topo = null;
        fim = null;
        tamanho = 0;
    }

    @Override
    public int tamanho() {
          return tamanho;
    }

    @Override
    public void limpar() {
        
    }

    @Override
    public NoE push(int valor) {
        if (fim==null) {
            topo = new NoE();
            fim = topo;
            NoE novoNoE = new NoE();
            novoNoE.setValor(valor);
            novoNoE.setNext(topo);
            topo = novoNoE;
            tamanho++;
            return topo; 
        }
        else {
            NoE novoNoE = new NoE();
            novoNoE.setValor(valor);
            novoNoE.setNext(topo);
            topo = novoNoE;
            tamanho++;
            return topo; 
        }
    }

    @Override
    public NoE pop() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
            return null; 
        }
        else {
            if (tamanho != 0) {
            topo = topo.getNext();
            tamanho--;
            }
            else {
                System.out.println("A pilha já está vazia!");
            }
        }
        return null;
    }
    

    @Override
    public int pegarTopo() {
        return 0; //na duvida
    }

    @Override
    public void listar() {
        if (tamanho != 0) {
            NoE percorre = topo;
            while (percorre.getNext() !=null){
                System.err.println(percorre.getValor());
                percorre = percorre.getNext();
        }}
        else {
            System.out.println("A pilha já está vazia!");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public boolean eVazia() {
       if (topo == null) {
           return true;
       }
         return false;
    }

}
