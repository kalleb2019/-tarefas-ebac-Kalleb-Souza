import java.util.List;
import java.util.stream.Stream;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of("Lucas", "Souza");
        Stream<String> st = nomes.stream();
    }
}