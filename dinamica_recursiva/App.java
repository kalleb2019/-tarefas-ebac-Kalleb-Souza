import fatorial.FatorialBU;
import fatorial.FatorialTD;
import fibonacci.FibonacciBU;
import fibonacci.FibonacciTD;

public class App {
    public static void main(String[] args) {
        System.out.println("Fat B_U");
        FatorialBU f1 = new FatorialBU(33);
        System.out.println(f1.getFatorial());

        System.out.println("Fat T_D");
        FatorialTD f2 = new FatorialTD(50);
        System.out.println(f2.getFatorial());

        System.out.println("Fib B_U");
        FibonacciBU f3 = new FibonacciBU(6);
        System.out.println(f3.getFibonacci());

        System.out.println("Fib T_D");
        FibonacciTD f4 = new FibonacciTD(6);
        System.out.println(f4.getFibonacci());
    }
}
