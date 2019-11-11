/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakma;

/**
 *
 * @author Diak
 */
public abstract class MesterEmber {
    protected String nev;
    protected int napiDij;
    protected boolean[] foglaltNapok;

    public MesterEmber(String nev, int napiDij) {
        this.nev = nev;
        this.napiDij = napiDij;
        this.foglaltNapok = new boolean[31];
        
        for(int i = 0; i < this.foglaltNapok.length; i++){
            this.foglaltNapok[i] = false;
        }
        
    }

    @Override
    public String toString() {
        String s = String.format("%s - %s Ft", this.nev, this.napiDij);
        for (int i = 0; i < this.foglaltNapok.length;i++){
            s += this.foglaltNapok[i] ? "F" : "S";
        }
        return s;
    }
    
    public abstract boolean MunkatVallal(int nap);
    
    
    
}
