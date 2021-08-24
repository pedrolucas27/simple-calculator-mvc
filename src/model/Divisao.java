
package model;


public class Divisao {
    private int divisor;
    private int dividendo;
    private double quociente;
    
    public Divisao(int dividendo, int divisor){
       this.dividendo = dividendo;
       this.divisor = divisor;
    }
    
    public double getQuociente(){
       this.quociente = (double) dividendo/divisor; 
       return this.quociente;
    }
}
