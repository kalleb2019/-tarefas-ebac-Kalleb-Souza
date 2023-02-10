import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {

        List <String> m = new ArrayList<>();
        List <String> f = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("exemplo: 'Ana-F,'");
        nome = sc.nextLine();

        String[] nomes = nome.split("[,-]+");
        for(int i = 0; i < nomes.length;i++){
            if(nomes[i].equals("M")||nomes[i].equals("m")){
                m.add( nomes[i-1]+" "+ nomes[i]);
            }else if(nomes[i].equals("F")||nomes[i].equals("f"))
                f.add( nomes[i-1]+" "+nomes[i]);
        }
        
        System.out.println("Usuarios Maculinos");
        for(String user:m){
            System.out.println(user);
        }
        System.out.println("Usuarios Femininos");
        for(String user:f){
            System.out.println(user);
        }

    }

    
}
