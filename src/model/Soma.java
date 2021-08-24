
package model;


public class Soma {
    
    private int p1;
    private int p2;
    private int total;
    
    public Soma(int p1, int p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public int getTotal(){
        this.total = p1 + p2;
        return this.total;
    }
}
