/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

/**
 *
 * @author Diak
 */
public class Uralkodo implements EroErzekeny,Sith{
    private double gonoszsag;

    public Uralkodo() {
        this.gonoszsag = 100;
    }
    
    
    @Override
    public boolean legyoziE(EroErzekeny o) {
        return o.mekkoraAzEreje()<this.gonoszsag?true:false;
    }

    @Override
    public double mekkoraAzEreje() {
       return this.gonoszsag*2;
    }

    @Override
    public void engeddElAHargod() {
        this.gonoszsag+=50;
    }

    public double getGonoszsag() {
        return gonoszsag;
    }

    public void setGonoszsag(double gonoszsag) {
        this.gonoszsag = gonoszsag;
    }

    @Override
    public String toString() {
        return "Uralkodo "+"gonoszsag=" +gonoszsag;
    }
    
    
    
    
}
