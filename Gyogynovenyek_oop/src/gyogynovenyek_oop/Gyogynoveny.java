/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyogynovenyek_oop;

/**
 *
 * @author Diak
 */
public class Gyogynoveny {
    private String name;
    private String collect;
    private int startColl;
    private int endColl;

    public Gyogynoveny(String name, String collect, int startColl, int endColl) {
        this.name = name;
        this.collect = collect;
        this.startColl = startColl;
        this.endColl = endColl;
    }

    public String getName() {
        return name;
    }

    public String getCollect() {
        return collect;
    }

    public int getStartColl() {
        return startColl;
    }

    public int getEndColl() {
        return endColl;
    }
    
    public String toString(){
        return this.name+" "+this.collect+" "+this.startColl+" "+this.endColl;
    }
    
    
    
}
