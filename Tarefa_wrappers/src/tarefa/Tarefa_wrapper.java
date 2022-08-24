package tarefa;

import java.util.Scanner;

public class Tarefa_wrapper {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra");
        char letraPri = sc.next().charAt(0);

        Character letraWra = letraPri;

        System.out.println(letraWra);

    }
}


