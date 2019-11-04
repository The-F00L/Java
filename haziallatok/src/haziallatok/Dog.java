package haziallatok;


import haziallatok.Pet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diak
 */
public class Dog extends Pet{
    private String bread;
    public Dog(String name ,String bread){
        super(name,4);
        this.bread=bread;
    }
    
    @Override
    public void Voice(){
        System.out.println("vau");
    }
    
   public void Descreption() {
       System.out.println("ae egy "+this.bread+"neve "+this.name);
   }

    
}
