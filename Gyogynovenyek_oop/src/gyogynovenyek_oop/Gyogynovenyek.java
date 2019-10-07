/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyogynovenyek_oop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Gyogynovenyek {
    
    private List<Gyogynoveny> gyogynoveny_List;
    
    public Gyogynovenyek(String file_Name){
        this.gyogynoveny_List = new ArrayList<>();
        
        try{
            FileReader _fr = new FileReader(file_Name);
            BufferedReader _br = new BufferedReader(_fr);
            String[] _dataLine;
            String _line = _br.readLine();
            while (_line != null){
                _dataLine=_line.split(";");
                    this.gyogynoveny_List.add(new Gyogynoveny(_dataLine[0],_dataLine[1],Integer.parseInt(_dataLine[2]),Integer.parseInt(_dataLine[3])));
                _line = _br.readLine();
            }
            
            _br.close();
            _fr.close();
        } catch (FileNotFoundException e){
            System.err.println("Nem letezo fajl");
        } catch (IOException e){
            System.err.println("Nincs jogosultság");
        } catch (Exception e){
            System.err.println("Általános hiba");
        }
    }
    
    public String toString(){
        String _line="";
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            _line+=gyogynoveny_List.get(i).getName();
            _line+=" ";
            _line+=gyogynoveny_List.get(i).getCollect();
            _line+=" ";
            _line+=gyogynoveny_List.get(i).getStartColl();
            _line+=" ";
            _line+=gyogynoveny_List.get(i).getEndColl();
            _line+=" \n";
        }
        return _line;
    }
    
    
   public String _collGyongy(){
       String _found="";
       for (int i = 0; i < gyogynoveny_List.size(); i++) {
           if (gyogynoveny_List.get(i).getName().toLowerCase().equals("gyongyvirag")) {
               _found=gyogynoveny_List.get(i).getCollect();
           }
       }
       return _found;
   }
    
   public int _collLevel(){
       int db=0;
       for (int i = 0; i < gyogynoveny_List.size(); i++) {
           if (gyogynoveny_List.get(i).getCollect().toLowerCase().equals("level")) {
               db++;
           }
       }
       
       return db;
       
   }
   
   public String _maxInMo(){
   String _month="";
   int _jan=0,_feb=0,_mar=0,_apr=0,_maj=0,_jun=0,_jul=0,_aug=0,_szep=0,_okt=0,_nov=0,_dec=0;
          int[] _monthNum =new int[12];
       
       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < gyogynoveny_List.size(); j++) {
               if (gyogynoveny_List.get(j).getStartColl()==i) {
                 switch (i) {
                    case 1:
                        _jan++;
                        _monthNum[i]=_jan;
                          break;
                    case 2:
                        _feb++;
                        _monthNum[i]=_feb;
                        break;
                    case 3:
                        _mar++;
                        _monthNum[i]=_mar;
                        break;
                    case 4:
                       _apr++;
                       _monthNum[i]=_apr;
                       break;
                    case 5:
                       _maj++;
                       _monthNum[i]=_maj;
                       break;
                    case 6:
                        _jun++;
                       _monthNum[i]=_jun;
                        break;
                    case 7:
                      _jul++;
                       _monthNum[i]=_jul;
                       break;
                     case 8:
                      _aug++;
                       _monthNum[i]=_aug;
                       break;
                     case 9:
                       _szep++;
                       _monthNum[i]=_szep;
                       break;
                    case 10:
                       _okt++;
                       _monthNum[i]=_okt;
                       break;
                    case 11:
                       _nov++;
                       _monthNum[i]=_nov;
                       break;
                    case 12:
                       _dec++;
                       _monthNum[i]=_dec;
                       break;
               default:
                   break;
           }  
               }
           }
       }
       
  
       
       int max=0;
       int _maxMonth=0;
       for (int i = 0; i < _monthNum.length; i++) {
           
           if (_monthNum[i]>max) {
               max=_monthNum[i];
               _maxMonth=i;
               
           }
       }
       
       switch (_maxMonth) {
           case 1:
               _month="Január";
               break;
           case 2:
               _month="Februar";
               break;
           case 3:
               _month="Március";
               break;
           case 4:
               _month="Április";
               break;
           case 5:
               _month="Május";
               break;
           case 6:
               _month="Junius";
               break;
           case 7:
               _month="Julius";
               break;
           case 8:
               _month="Augusztus";
               break;
           case 9:
               _month="Szeptember";
               break;
           case 10:
               _month="Oktober";
               break;
           case 11:
               _month="November";
               break;
           case 12:
               _month="December";
               break;
           default:
               _month="semmi";
               break;
           
       }
       
        return _month;     
      }
    
   
   public void _nothingInMonth(){
                 String _month="";
                    int _jan=0,_feb=0,_mar=0,_apr=0,_maj=0,_jun=0,_jul=0,_aug=0,_szep=0,_okt=0,_nov=0,_dec=0;
                     int[] _monthNum =new int[12];
       
       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < gyogynoveny_List.size(); j++) {
               if (gyogynoveny_List.get(j).getStartColl()==i) {
                 switch (i) {
                    case 1:
                        _jan++;
                        _monthNum[i]=_jan;
                          break;
                    case 2:
                        _feb++;
                        _monthNum[i]=_feb;
                        break;
                    case 3:
                        _mar++;
                        _monthNum[i]=_mar;
                        break;
                    case 4:
                       _apr++;
                       _monthNum[i]=_apr;
                       break;
                    case 5:
                       _maj++;
                       _monthNum[i]=_maj;
                       break;
                    case 6:
                        _jun++;
                       _monthNum[i]=_jun;
                        break;
                    case 7:
                      _jul++;
                       _monthNum[i]=_jul;
                       break;
                     case 8:
                      _aug++;
                       _monthNum[i]=_aug;
                       break;
                     case 9:
                       _szep++;
                       _monthNum[i]=_szep;
                       break;
                    case 10:
                       _okt++;
                       _monthNum[i]=_okt;
                       break;
                    case 11:
                       _nov++;
                       _monthNum[i]=_nov;
                       break;
                    case 12:
                       _dec++;
                       _monthNum[i]=_dec;
                       break;
               default:
                   break;
           }  
               }
           }
       }
       
  
       
       
       for (int i = 0; i < _monthNum.length; i++) {
           
           if (_monthNum[i]==0) {
               
         switch (i) {
           case 1:
               _month="Január";
               break;
           case 2:
               _month="Februar";
               break;
           case 3:
               _month="Március";
               break;
           case 4:
               _month="Április";
               break;
           case 5:
               _month="Május";
               break;
           case 6:
               _month="Junius";
               break;
           case 7:
               _month="Julius";
               break;
           case 8:
               _month="Augusztus";
               break;
           case 9:
               _month="Szeptember";
               break;
           case 10:
               _month="Oktober";
               break;
           case 11:
               _month="November";
               break;
           case 12:
               _month="December";
               break;
          
           
                }
              System.out.println(_month); 
           }
       }
    
    }
       
   public int _oneWord(){
       int db=0;
       for (int i = 0; i < gyogynoveny_List.size(); i++) {
           if (gyogynoveny_List.get(i).getName().contains(" ")) {
               db++;
           }
       }
       return db;
   }
   
   public String _fallColl(){
       String _fallColl="";
       for (int i = 0; i < gyogynoveny_List.size(); i++) {
           if (gyogynoveny_List.get(i).getStartColl()==9) {
               _fallColl+=gyogynoveny_List.get(i).getName()+"\n";
           }else if(gyogynoveny_List.get(i).getStartColl()==10){
               _fallColl+=gyogynoveny_List.get(i).getName()+"\n";;
           }else if(gyogynoveny_List.get(i).getStartColl()==11){
               _fallColl+=gyogynoveny_List.get(i).getName()+"\n";;
           }
       }
       return _fallColl;
    }
  
    public String _summerColl(){
       String _summerColl="";
       for (int i = 0; i < gyogynoveny_List.size(); i++) {
           if (gyogynoveny_List.get(i).getStartColl()==7) {
               _summerColl+=gyogynoveny_List.get(i).getName()+"\n";
           }
       }
       return _summerColl;
    }
    
    public String _maxCollTime(){
      String _maxCollTime="";
      int max=gyogynoveny_List.get(0).getEndColl()-gyogynoveny_List.get(0).getStartColl();
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            int def=gyogynoveny_List.get(i).getEndColl()-gyogynoveny_List.get(i).getStartColl();
            if (def>max) {
                _maxCollTime+=gyogynoveny_List.get(i).getName()+"\n";
            }
        }
        return _maxCollTime;
    
    }
    
    public String _asCsalan(){
        String _csalanWhy="";
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            if (gyogynoveny_List.get(i).getName().toLowerCase().equals("csalan")) {
              _csalanWhy=gyogynoveny_List.get(i).getCollect().toLowerCase();
            }
        }
        String _similar="";
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            if (gyogynoveny_List.get(i).getCollect().toLowerCase().equals(_csalanWhy)) {
                _similar+=gyogynoveny_List.get(i).getName()+"\n";
            }
        }
        return _similar;
    }
    
    public String _Virag(){
        String _Virag="";
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            if (gyogynoveny_List.get(i).getCollect().toLowerCase().contains("virag")) {
                _Virag+=gyogynoveny_List.get(i).getName()+"\n";
            }
        }
        return _Virag;
    }
    
    public String _maxPartsColl(){
        int _dbLevel=0,_dbVirag=0,_dbViraghajtas=0,_dbTermes=0,_dbGyoker=0,_dbGyokertorzs=0,_dbAltermes=0,_dbLeveleshajtas=0,_dbViragzat=0;
        
        
        for (int i = 0; i < gyogynoveny_List.size(); i++) {
            if (gyogynoveny_List.get(i).getCollect().toLowerCase().equals("level")) {
            _dbLevel++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("virag")){
            _dbVirag++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("viragzo hajtas")){
            _dbViraghajtas++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("termes")){
            _dbTermes++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("gyoker")){
            _dbGyoker++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("gyokertorzs")){
            _dbGyokertorzs++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("altermes")){
            _dbAltermes++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("leveles hajtas")){
            _dbLeveleshajtas++;
            }else if(gyogynoveny_List.get(i).getCollect().toLowerCase().equals("viragzat")){
            _dbViragzat++;
            }
            
            int max;
            for (int j = 0; j < 9; j++) {
                
            }
            
            
        }
             return null;
            /*
            for (int j = 0; j < gyogynoveny_List.size(); j++) {
                for (int k = 0; k < gyogynoveny_List.size(); k++) {
                    if (gyogynoveny_List.get(j).getCollect().toLowerCase()==gyogynoveny_List.get(i).getCollect().toLowerCase()) {
                        
                    }
                }*/
            }
   
    public String _nothingInMon(){
        boolean _van=false;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < gyogynoveny_List.size(); j++) {
                if (gyogynoveny_List.get(j).getStartColl()==i) {
                    _van=true;
                }
            }
        }
        if (_van) {
            return "Van";
        }else{
            return "Nincs";
        }
        
        
    }
    
    
    }
    
  

    

