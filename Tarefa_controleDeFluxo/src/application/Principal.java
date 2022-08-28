package application;

import java.util.Scanner;
public class Principal {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        Controle controle = new Controle();

        double notas[] = new double[4];
        for(int i =0;i < notas.length;i++){
            System.out.println("Digite a "+(i+1)+" nota do Aluno");
            notas[i] = sc.nextDouble();
        }

        controle.somaNotas(notas);
        System.out.println(controle.estruturaCondicional());

    }
}
