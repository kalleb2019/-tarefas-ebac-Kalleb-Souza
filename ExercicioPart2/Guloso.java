import java.util.ArrayList;
import java.util.List;

public class Guloso {
    private List <Integer> resultado;
    public Guloso(int n, int[] moedas ){
        resultado = calcularTroco(n,moedas);
    }

    public static List<Integer> calcularTroco(int n, int[] moedas) {
        List<Integer> escolhaMoedas = new ArrayList<>();
        int soma = 0;
        
        
        int[] moedasOrdenadas = ordenarDecrescente(moedas);
        
        
        while (soma != n) {
            boolean encontrouMoeda = false;
            
            
            for (int i = 0; i < moedasOrdenadas.length; i++) {
                int x = moedasOrdenadas[i];
                
                if (soma + x <= n) {
                    escolhaMoedas.add(x);
                    soma += x;
                    encontrouMoeda = true;
                    break;
                }
            }
            
           
            if (!encontrouMoeda) {
                return null;
            }
        }
        
        return escolhaMoedas;
    }

    public static int[] ordenarDecrescente(int[] moedas) {
        int[] ordenadas = moedas.clone();
        for (int i = 0; i < ordenadas.length - 1; i++) {
            for (int j = 0; j < ordenadas.length - i - 1; j++) {
                if (ordenadas[j] < ordenadas[j + 1]) {
                    int temp = ordenadas[j];
                    ordenadas[j] = ordenadas[j + 1];
                    ordenadas[j + 1] = temp;
                }
            }
        }
        return ordenadas;
    }

    public List<Integer> getResultado() {
        return resultado;
    }
    
}