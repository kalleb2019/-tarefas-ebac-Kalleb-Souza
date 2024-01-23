package br.com.souza;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {


            Scanner scan = new Scanner(System.in);
            List<Pessoa> listaPessoas = new ArrayList();
            String dados;

            System.out.println("Use sem aspas simples: 'Julio-m,Ana-f,Julia-f,Roberta-f,Sandro-m,Fernanda-f,Micaela-f,Ana-f,João-m,Abreu-m,Sonia-f,Lucas-m,Roberto-m,Leticia-f,Marcos-m'");
            dados = scan.nextLine();
            String dadosDivididos[] = dados.split("[,-]+");

            for(int i = 0;i < dadosDivididos.length -1; i+=2){
                listaPessoas.add(new Pessoa(dadosDivididos[i],dadosDivididos[i+1]));
            }

            List<Pessoa> SomenteMulheres = listaPessoas.stream()
                    .filter(p -> p.getSexo().equals("f"))
                    .collect(Collectors.toList());

            SomenteMulheres.forEach(p -> System.out.println(p.getNome() + " " + p.getSexo()));


    }
}
