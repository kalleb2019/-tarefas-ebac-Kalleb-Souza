package com.carro;

public class Audi extends Carro{

    public Audi(String motor, String roda, String cor, String modelo, int cavalos) {
        super(motor, roda, cor, modelo, cavalos);
        //TODO Auto-generated constructor stub
    }
    

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "Audi: " + super.toString();
   }
    
}
