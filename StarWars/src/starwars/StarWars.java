package starwars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JRZ
 */
public class StarWars {

    public static ArrayList<EroErzekeny> lista=new ArrayList<EroErzekeny>();
    
    public static void main(String[] args) {
       try{
         szereplok("be.txt");
         sithek();
       }catch(Exception ex){
           System.out.println("Hiba történt.");
       }
    }
    
    public static void szereplok(String ut) throws FileNotFoundException, IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(ut) )) {
            String line = br.readLine () ;
            
            while ( line != null ) {
                
                String[] szavak = line.split (" ") ;
                
                if(szavak[0].equals("Anakin") ) {
                    AnakinSkywalker as =new AnakinSkywalker();
                    
                    for (int i =0; i < Integer.parseInt(szavak[1]) ; i ++) {
                        as.engeddElAHargod();
                    }
                    lista.add( as );
                }else if (szavak[0].equals("Uralkodo") ) {
                    Uralkodo u =new Uralkodo () ;
                    for (int i =0; i < Integer.parseInt(szavak[1]) ; i ++) {
                        u.engeddElAHargod();
                    }
                    lista.add(u);
                }else {
                    System.out.println (" Rossz sor ");
                }
                line = br . readLine () ;
            }
        }
    }
    
    public static void sithek(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
    
    
}
