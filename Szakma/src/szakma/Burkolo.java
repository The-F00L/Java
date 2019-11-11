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
public class Burkolo extends MesterEmber{
    private Helyszin helyszin;

    public Burkolo(String nev, int napiDij, Helyszin helyszin) {
        super(nev, napiDij);
        this.helyszin = helyszin;
    }
    
    public int osszesSzabadnap(){
        int db = 0;
        for(int i = 0; i < super.foglaltNapok.length; i++)
        {
            if(!super.foglaltNapok[i]){
              db++; 
            }
        }
        
        return db;
    }
    
    @Override
    public boolean MunkatVallal(int nap){
        boolean foglaltE = false;
        if(!super.foglaltNapok[nap]){
            super.foglaltNapok[nap] = true;
            foglaltE = true;
        }
        return foglaltE;
    }
    
    
    
}
