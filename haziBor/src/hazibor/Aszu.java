/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazibor;

/**
 *
 * @author Diak
 */
public class Aszu extends Bor {
    private Puttyon puttyon;

    public void setPuttyon(Puttyon puttyon) {
        this.puttyon = puttyon;
    }

    public Puttyon getPuttyon() {
        return puttyon;
    }
    
    public Aszu(int evjarat,Puttyon puttyon) {
        super("aszu", evjarat);
        this.puttyon=puttyon;
    }

    @Override
    public String toString() {
        return "Bor{" + "fajta=" + super.getFajta() + ", evjarat=" + super.getEvjarat() + "Aszu{" + "puttyon=" + puttyon + '}';
    }
    
    
}
