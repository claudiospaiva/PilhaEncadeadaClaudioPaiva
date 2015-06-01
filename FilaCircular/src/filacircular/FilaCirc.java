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
public class FilaCirc implements interfaceFilaCircular {
    
    private int head=0;
    private int tail=0;
    private NoC FC[];
    private int capacidade;
    private int quantidade = 0;

  
    @Override
    public void criarFila(int tamanho) {
        FC = new NoC [tamanho];
        capacidade = tamanho;
        System.out.println("Fila criada.");
        
    }

    @Override
    public boolean eCheia() {
        return quantidade==capacidade;
        
    }

    @Override
    public boolean eVazia() {
        return quantidade==0;
        
    }

    @Override
    public int tamanho() {
        return tail+1;
    }

    @Override
    public NoC enfileirar(int valor) {
        if (!eCheia()) {
            NoC aux = new NoC (valor);
            if(quantidade < capacidade && tail < capacidade){
                FC[tail++] = aux;
                quantidade++;
                return aux;
            } else if (tail == capacidade){
                tail = 0;
                FC[++tail] = aux;
                quantidade++;
                return aux;
            }
        }
        System.out.println("A fila esta preenchida!");
        return null;
        
    }

    @Override
    public NoC desenfileirar() {
        if (!eVazia()) {
                NoC aux = FC[head];
                FC[head++] = null;
                quantidade--;
                System.out.println("O Elemento "+ aux.getValor() + " foi retirado do campo " + head + "!! ");
                return aux;
        }
        System.out.println("A fila nÃ£o possui elementos.");
        return null;
        
    }

    @Override
    public int pegarInicio() {
        if (head != 0 && tail !=0){
            return FC[head].getValor();
        }
        else {
            return -1;
        }
    }

    @Override
    public void listar() {
        if (!eVazia()) {
            for (int i = head; i < tail; i++) {
                System.out.println(FC[i].getValor());
            }
            
        }
    }
    
}
