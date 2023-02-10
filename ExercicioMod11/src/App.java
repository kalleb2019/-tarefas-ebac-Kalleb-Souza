import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        String nome;
        System.out.println("Digite o nome do Usuario e o sexo");
        nome = sc.nextLine();
        System.out.println("Digite o sexo do Usuario");
        String sexo;
        sexo = sc.nextLine();
        
        if(sexo.equals("F") || sexo.equals("f"))
            feminino.add(nome + " "+sexo);
        else if(sexo.equals("M") || sexo.equals("m"))
            masculino.add(nome + " "+sexo);
        
            for(String array: feminino){
                System.out.println(array);
            }

            for(String array: masculino){
                System.out.println(array);
            }
    }
}
