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
public abstract class Jedi implements EroErzekeny{
    protected double ero;
    protected boolean atallhatE;

    public abstract boolean megteremtiAzEgyensulyt () ;
    
    
    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public double getEro() {
        return ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    @Override
    public String toString() {
        return "  Jedi " + " ero= " + ero + " atallhatE= " + atallhatE;
    }
    
   public boolean legyoziE(EroErzekeny e){
       if (e instanceof Uralkodo) {
           return e.mekkoraAzEreje()*2<this.ero?true:false;
       }else if(e instanceof Jedi){
           return ((Jedi) e).isAtallhatE()&&this.ero >e.mekkoraAzEreje()?true:false;
       }else{
           return false;
       }
   }
        


    
}
