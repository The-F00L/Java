/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmesalk;

/**
 *
 * @author Diak
 */
public class Film {
    private String cim;
    private int korHatar;

   
    public Film(String cim, int korHatar) {
        this.cim = cim;
        this.korHatar = korHatar;
    }

    public String getCim() {
        return cim;
    }

    public int getKorHatar() {
        return korHatar;
    }
    
    
    public boolean getAjanlott(int ajal){
        if(!(ajal<korHatar)) {
            return false;
        }else{
            return true;
        }
    
    }

    @Override
    public String toString() {
        return "Film{" + "cim=" + cim + ", korHatar=" + korHatar + '}';
    }
    
    
    
    
    
}
