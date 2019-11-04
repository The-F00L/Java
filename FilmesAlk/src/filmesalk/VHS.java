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
public class VHS extends Film {
    private int szalagHossz;
    
    public VHS(String cim, int korHatar,int szalagHossz) {
        super(cim, korHatar);
        this.szalagHossz=szalagHossz;
    }

    @Override
    public String toString() {
        return "Cim: "+super.getCim()+" Korhatar: "+super.getKorHatar()+" VHS" + "szalagHossz: " + szalagHossz + '}';
    }

    public int getSzalagHossz() {
        return szalagHossz;
    }
    
}
