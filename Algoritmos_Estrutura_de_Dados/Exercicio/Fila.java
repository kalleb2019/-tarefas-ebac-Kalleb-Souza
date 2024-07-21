package Exercicio;

public class Fila {
    private int ultimo;
    private Integer[] itens;
    
    public Fila(int capacidade) {
        this.itens = (Integer[]) new Object[capacidade];
        this.ultimo = -1;
    }
    
    public void enqueue(Integer item) {
        this.ultimo++;
        this.itens[this.ultimo] = item;
    }
    
    public Integer dequeue() throws Exception{
        
        if (this.isEmpty()) {
            throw new RuntimeException("A fila está vazia.");
        }
        
        this.ultimo--;
        
        Integer primeiroDaFila = this.itens[0];
        
        for(int i = 0; i<= this.ultimo; i++){
            this.itens[i] = this.itens[i+1];
        }
        
        return primeiroDaFila;
    }
    
    public Integer rear() {
        return this.itens[this.ultimo];
    }
    
    public Integer front() {
        return this.itens[0];
    }
    
    public int size() {
        return this.ultimo;
    }
    
    public boolean isEmpty() {
        return this.ultimo < 0;
    }
}
