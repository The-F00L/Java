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
public enum Puttyon{
    Három(3),
    Négy(4),
    Öt(5),
    Hat(6);
    
    private final int value;
    private Puttyon(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
