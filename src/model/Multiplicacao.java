
package model;


public class Multiplicacao {
    private int f1;
    private int f2;
    private int produto;
    
    public Multiplicacao(int f1, int f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    
    public int getProduto(){
        this.produto = f1 * f2;
        return this.produto;
    }
}
