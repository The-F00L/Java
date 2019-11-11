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
public abstract class Bor {
    private String fajta;
    private int evjarat;

    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    @Override
    public String toString() {
        return "Bor{" + "fajta=" + fajta + ", evjarat=" + evjarat + '}';
    }
    
    
    
    
}
