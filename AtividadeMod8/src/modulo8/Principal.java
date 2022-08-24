package modulo8;
import java.util.Scanner;
public class Principal {
    public static void main (String []args){

        System.out.println("Resultado final: "+calculadoraMedia());
    }
    public static double calculadoraMedia(){
        double nota1,nota2,nota3,nota4,t;
        Scanner tl = new Scanner(System.in);
        System.out.println("Digite o valor a nota 1");
        nota1 = tl.nextInt();
        System.out.println("Digite o valor a nota 2");
        nota2 = tl.nextInt();
        System.out.println("Digite o valor a nota 3");
        nota3 = tl.nextInt();
        System.out.println("Digite o valor a nota 4");
        nota4 = tl.nextInt();

        return t = ((nota1+nota2+nota3+nota4)/4);
    }
}
