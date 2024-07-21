package fatorial;
public class FatorialBU {
    private int num;
    private static int[] aux;
    private int fatorial;

    
    public FatorialBU (int num){
        this.num = num;
        fatorial = calcFatorial(this.num);
    }

    public static int calcFatorial(int n) {
        aux = new int[n];
        int fatAtual = n;
        aux[0] = 1;

        for (int i = 1; i < n; i++) {
            aux[i] = aux[i - 1] * fatAtual;
            fatAtual--;
        }

        return aux[n - 1];
    }

    public int getFatorial() {
        return this.fatorial;
    }
}