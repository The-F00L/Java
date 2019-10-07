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
public class Gyogynovenyek_oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Gyogynoveny _gyogynev=new Gyogynoveny("Alama","kecske",2,5);
        //System.out.println(_gyogynev.toString());
        
        Gyogynovenyek _gyogynovenyek = new Gyogynovenyek("gyogynovenyek.txt");
       
        System.out.println( _gyogynovenyek.toString());
        
        System.out.println("1. Írd ki, hogy a gyöngyvirág melyik részét gyűjtik!");
        System.out.println(_gyogynovenyek._collGyongy());
        
        System.out.println("2. Írd ki, hány növényt gyűjtenek a leveléért! ");
        System.out.println(_gyogynovenyek._collLevel());
        
        System.out.println("3. Írd ki, melyik hónapban kezdik gyűjteni a legtöbb növényt!");
        System.out.println(_gyogynovenyek._maxInMo());
        
        System.out.print("4. Írd ki azokat a hónapokat, amikor semmit nem kezdenek gyűjteni!");
        _gyogynovenyek._nothingInMonth();
        
        System.out.println("5. Hány növény neve áll egy szóból?");
        System.out.println(_gyogynovenyek._oneWord());
    
        System.out.println("6. Írd ki, hogy melyik növényeket kezdik el ősszel gyűjteni! ");
        System.out.println(_gyogynovenyek._fallColl());
    
        System.out.println("7. Hány növényt gyűjtenek a nyár elejétől kezdődően? ");
        System.out.println(_gyogynovenyek._summerColl());

        System.out.println("8. Melyik növényt vagy növényeket gyűjtik a legtöbb ideig? ");
        System.out.println(_gyogynovenyek._maxCollTime());
        
        System.out.println("9. Miket gyűjtenek ugyanazon részéért, mint a csalánt? ");
        System.out.println(_gyogynovenyek._asCsalan());
        
        System.out.println("10. Hány növényt gyűjtenek valamilyen virággal kapcsolatos részéért (virág, virágzat, stb)? ");
        System.out.println(_gyogynovenyek._Virag());
        
        System.out.println("11. Melyik növényrészeket gyűjtik a legtöbb esetben? ");
        
        
        System.out.println("12. Van-e olyan hónap, amikor semmit nem gyűjtenek? ");
        System.out.println(_gyogynovenyek._nothingInMon());
        
        System.out.println("13. Melyik hónapban gyűjtik a legtöbb fajta növényt? ");
        
        
        System.out.println("14. Írd ki a növények adatait olyan sorrendben, hogy mikor kezdik gyűjteni őket! ");
     
        
        System.out.println("15. Írd ki, hogy melyik növényt hány hónapig gyűjtenek! ");
        
        
        System.out.println("16. Írd ki egy gyujtendok.txt fájlba a növényeket és adataikat a forrásnak megfelelő szerkezetben, de a gyűjtendő rész szerint növekvő sorrendben!");
    
        
        System.out.println("17. Írd ki egy gyogynovenyidoszak.txt fájlba a növényeket a gyűjtési időszakának hossza alapján növekvő sorrendbe! Ha ez a tulajdonságuk megegyezik, a nevük döntse el a sorrendet!");
    }
    
}
