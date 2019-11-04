/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haziallatok;

/**
 *
 * @author Diak
 */
public abstract class Pet {
    
    protected String name;
    protected int numberoflags;

    public Pet(String name, int numberoflags) {
        this.name = name;
        this.numberoflags = numberoflags;
    }

    public void Descreption(){
        System.out.println("errol az asd  nerm  tuodk sokaz");
    }
    
    public int HowManniLags(){
    return this.numberoflags;
    }
    
    public abstract void Voice();
    
    
}
