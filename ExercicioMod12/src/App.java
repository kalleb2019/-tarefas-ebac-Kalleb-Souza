import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite os nomes Separado por ',' ");
        nome = sc.nextLine();
        String[] nomes = nome.split(",");
        imprimirNome(ConverterVetor(nomes));
        
    }

    public static void imprimirNome(List <String> listaNome){
        Collections.sort(listaNome);

        for(String n : listaNome){
            System.out.println(n);
        }
    }
    public static List <String> ConverterVetor(String nome[]){
        List <String> nomesConve = new ArrayList<>();
        for(String n: nome){
            nomesConve.add(n);
        }
        return nomesConve;
    }
}
