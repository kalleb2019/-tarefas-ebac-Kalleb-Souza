import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public Backtracking(int[] s, int n) {
        subconjuntos(s, n);
    }

    public static List<List<Integer>> subconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        subconjuntosAux(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void subconjuntosAux(int[] S, int n, int indice, List<Integer> atual,
            List<List<Integer>> resultado) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = indice; i < S.length; i++) {
            atual.add(S[i]);
            subconjuntosAux(S, n, i + 1, atual, resultado);
            atual.remove(atual.size() - 1);
        }
    }

}