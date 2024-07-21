import java.util.List;

public class App {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int s = 2;
        List<List<Integer>> sub = Backtracking.subconjuntos(a, s);
       
        System.out.println("Subconjuntos de tamanho " + s + ":");
        for (List<Integer> Res : sub) {
            System.out.println(Res);
        }

        int[] moedas = {5,2,1,4,8,9};
        try {
            Guloso g = new Guloso(20, moedas);
            for(int i = 0 ; i < moedas.length;i++){
                int res = 0;
                int qtd = 0;
                for(Integer resultado : g.getResultado()){
                    if(moedas[i] == resultado){
                        ++qtd;
                        res = resultado;
                    }
                }
                System.out.println(qtd + ":" + res );
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
