package fatorial;
public class FatorialTD {
    private int num;
    private static int[] aux;
    private int fatorial;

    public FatorialTD(int num){
        this.num = num;

        this.fatorial = topDown(this.num);
    }
    
    
    public static int topDown(int n) {
        aux = new int[n + 1];
        
        aux[0] = 1;
        aux[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            aux[i] = -1;
        }
        
        return fat(n);
    }
    
    public static int fat(int n) {

        int r = n * aux[n - 1];
        
        if (aux[n] == -1) {
            aux[n] = n * fat(n - 1);
        }
        
        return aux[n];
    }


    public int getFatorial() {
        return fatorial;
    }
    
}