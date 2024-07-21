package fibonacci;

public class FibonacciBU {
    private int num;
    private static int[] aux;
    private int fibonacci;

    public FibonacciBU(int num){
        this.num = num;
        this.fibonacci = calcFibonacci(this.num);
    }
    
    //test
    public static int calcFibonacci(int n) {
        
        aux = new int[n];
        
        aux[0] = 1;
        aux[1] = 1;
        
        for (int i = 2; i < n; i++) {
            aux[i] = aux[i - 1] + aux[i - 2];
        }
        
        return aux[n-1];
    }

    public int getFibonacci() {
        return fibonacci;
    }
    
    
}