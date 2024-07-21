import Exercicio.IPilha;
import Exercicio.PilhaInteiros;

public class app {
    public static void main(String[] args) {
       
        IPilha a = new PilhaInteiros(10);
      
        try {
            for(int i = 0;i < 6; i++){
                a.push(i);
            }
            System.out.println(a.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            for(int i = a.size();i > 0; i--){
                a.pop();
                System.out.println(a.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            for(int i = a.size();i > -1; i--){
                a.pop();
                System.out.println(a.size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
