package Exercicio;

public class PilhaInteiros implements IPilha<Integer> {

    private int[] inteiros;
    private int tamanhoMaximo;
    private int ponteiro;
    
    public PilhaInteiros(int capacidadePilha) {
        this.inteiros = new int[capacidadePilha];
        this.tamanhoMaximo = capacidadePilha;
        this.ponteiro = -1;
    }

    @Override
    public void push(int numero) {
        if (this.ponteiro < tamanhoMaximo - 1) {
            this.ponteiro++;
            this.inteiros[this.ponteiro] = numero;
        } else {
            throw new RuntimeException("Limite Excedido");
        }
    }

    @Override
    public int pop() {
        if (this.ponteiro < 0) {
            throw new RuntimeException("A pilha está vazia");
        }
        
        int inteiroRemovido = this.inteiros[this.ponteiro];
        this.inteiros[this.ponteiro] = 0; 
        this.ponteiro--;
        return inteiroRemovido;
    }

    @Override
    public boolean isEmpty() {
        return this.ponteiro < 0;
    }

    @Override
    public int size() {
        return this.ponteiro + 1;
    }

    @Override
    public int top()  {    
        if (this.isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return this.inteiros[this.ponteiro];
    }    
}
