import java.lang.reflect.Constructor;

import br.com.souza.reflection.Pessoa;
import br.com.souza.reflection.Tabela;

public class App {
    public static void main(String[] args) {

        Class nomeClasse = Pessoa.class;

        if(nomeClasse.isAnnotationPresent(Tabela.class)){
            System.out.println(nomeClasse.getAnnotation(Tabela.class));
        }
    }
}
