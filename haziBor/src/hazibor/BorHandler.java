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
public class BorHandler {
    
    private Bor bor;
    private Aszu aszu;
    
    public BorHandler(Bor bor) {
        this.bor=bor;
    }
    public BorHandler(Aszu aszu){
        this.aszu=aszu;
    }
    
    public BorHandler(){
        
    }
    public String kiirBor(){
        return bor.toString()+"\n"+aszu.toString();
        
    }
    
    
}
