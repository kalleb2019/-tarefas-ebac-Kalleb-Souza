package fibonacci;

public class FibonacciTD {
    private int num;
    private static int[] aux;
    private int fibonacci;

   public FibonacciTD (int num){
        this.num = num;
        fibonacci = topDown(this.num);
        
    }

    public static int topDown(int n) {
        
        aux = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            aux[i] = -1;
        }
        
        return fr(n);
    }
    
    public static int fr(int n) {
        
        if (n < 2) {
            return n;
        }
        
        if (aux[n] == -1) {
            aux[n] = fr(n - 1) + fr(n - 2);
        } 
        
        return aux[n];
     
    }

    public int getFibonacci() {
        return fibonacci;
    }
    

   
    
}