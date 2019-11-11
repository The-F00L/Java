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
public class VizvezetekSzerelo extends MesterEmber {
     private int tapasztalat;
    
    public VizvezetekSzerelo(String nev, int napiDij, int tapasztalat) {
        super(nev, napiDij);
        this.tapasztalat = tapasztalat;
    }

    @Override
    public boolean MunkatVallal(int nap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "nev" +super.nev+"napidij"+super.napiDij+"VizvezetekSzerelo{" + "tapasztalat=" + tapasztalat + '}';
    }
    
    public boolean munkatVallal(int erdek){
        for (int i = 0; i < super.foglaltNapok.length; i++) {
            if(super.foglaltNapok[erdek-1]==true) {
                if(super.foglaltNapok[erdek]==true) {
                    if(super.foglaltNapok[erdek+1]==true) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        
    };
    
    
}
