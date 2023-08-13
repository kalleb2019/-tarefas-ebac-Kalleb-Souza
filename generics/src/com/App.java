package com;
import com.carro.Audi;
import com.carro.Bmw;
import com.carro.Mercedes;
import com.lista.Lista;

public class App {
    public static void main(String[] args) {
        
        Bmw m1 = new Bmw("2.0", "LigaLeve", "Grafit", "M1", 150);
        Bmw m2 = new Bmw("8.0", "Sportiva", "Preto", "M2", 200);
        Bmw m3 = new Bmw("3.0", "LigaLeve", "Branco", "M3", 180);

        Lista <Bmw> modelos = new Lista<>();
        modelos.pushCarro(m1);
        modelos.pushCarro(m2);
        modelos.pushCarro(m3);
        modelos.mostrarCarro();

        System.out.println("");

        Mercedes c200 = new Mercedes("1.6", "Sport", "Branco", "C100", 120);
        Mercedes c400 = new Mercedes("2.5", "Luxo", "Branco", "C200", 200);
        Mercedes g63 = new Mercedes("4.0", "Sport", "Preto", "c63", 309);

        Lista<Mercedes> modelos2 = new Lista<>();
        modelos2.pushCarro(c200);
        modelos2.pushCarro(c400);
        modelos2.pushCarro(g63);
        modelos2.mostrarCarro();    
            
        System.out.println("");
        
        Lista <Audi> modelo3 = new Lista<>();
        Audi a1 = new Audi("3.0", "Sport", "Preto", "A1", 90);
        Audi a5 = new Audi("2.0", "LigaLeve", "Azul", "a5", 130);
        modelo3.pushCarro(a1);
        modelo3.pushCarro(a5); 
        modelo3.mostrarCarro(); 
        
    }
    


}
