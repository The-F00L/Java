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
public class AnakinSkywalker extends Jedi implements Sith {

    public AnakinSkywalker() {
        super(150, true);
    }
    
    

    @Override
    public void engeddElAHargod() {
      this.ero+=(Math.random()*10) ;
      
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return this.ero>1000?true:false;
        
    }

    @Override
    public String toString() {
        return "AnakinSkywalker" + super.toString();
    }

    @Override
    public double mekkoraAzEreje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


   
   
    
    
    
}
