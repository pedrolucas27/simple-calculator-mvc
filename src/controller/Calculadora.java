
package controller;

import model.Soma;
import model.Subtracao;
import model.Multiplicacao;
import model.Divisao;



public class Calculadora {
    
    public int somar(int p1, int p2){
        Soma s = new Soma(p1, p2);
        return s.getTotal();
    }
    
     public int subtrair(int p1, int p2){
        Subtracao s = new Subtracao(p1, p2);
        return s.getTotal();
    }
     
    public int multiplicar(int f1, int f2){
        Multiplicacao m = new Multiplicacao(f1, f2);
        return m.getProduto();
    }
    
    public double dividir(int dividendo, int divisor){
        Divisao d = new Divisao(dividendo, divisor);
        return d.getQuociente();
    }
     
    
}
