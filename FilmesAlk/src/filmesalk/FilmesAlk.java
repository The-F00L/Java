/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmesalk;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Diak
 */
public class FilmesAlk {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       ArrayList<Film> FilmekLista = new ArrayList<>();
       Film[] filmek=new Film[10];
      
       
       //filmek[0]=new VHS("a",2,10);
       
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'a');
        String _Cim=c+"i";
        
        for (int i = 0; i < 5; i++) {
            filmek[i]=new VHS(CimGen.generateRandomString(5),i,i*2);
        }
        
        
        for (int i = 5; i < 5; i++) {
            filmek[i]=new DVD(_Cim,i,new String[]{"ang","hun"});
        }
        
        
        
        for (int i = 0; i < filmek.length; i++) {
            System.out.println(filmek[i].toString());
        }
        
        
        //System.out.println(film.toString());
        
    }
    
}
