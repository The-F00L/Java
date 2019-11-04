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
public class DVD extends Film{
    
    private String[] nyelv;
    
    public DVD(String cim, int korHatar,String[] nyelv) {
        super(cim, korHatar);
        this.nyelv=nyelv;
    }

    @Override
    public String toString() {
        return "DVD{" + "nyelv=" + nyelv + '}';
    }

    public String[] getNyelv() {
        return nyelv;
    }
    
    
}
