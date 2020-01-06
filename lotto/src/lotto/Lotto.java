/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import felulet.FrameLotto;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Diak
 */
public class Lotto {
    private List<Integer> lottoSzamok;
    private int maxLottoszam;
    private int lottoTipus;

    public Lotto(int lottoTipus) {
        this.lottoSzamok=new ArrayList<>();
        
    }
    
    public void ujLotto(int lottoTipus){
    this.lottoSzamok.clear();
    this.lottoTipus=lottoTipus;
        switch(this.lottoTipus){
            case 6: this.maxLottoszam=45;break;
            case 7: this.maxLottoszam=35;break;
            default:
                this.lottoTipus=5;
                this.maxLottoszam=90;
                break;
                
        }
    }
    
    public int getLottoTipus(){
        return lottoTipus;
    }
    
    public int getMaxLottoszam(){
        return maxLottoszam;
    }
    
    public int getKihuzottSzamokSzama(){
        return this.lottoSzamok.size();
    }
    
    public boolean mindenSzamotKihuztak(){
        return getKihuzottSzamokSzama()==this.lottoTipus;
    }
    
    
    public int sorsol() throws Exception{
        int szam=0;
        if (!mindenSzamotKihuztak()) {
            do {
                szam=(int) (Math.random()*maxLottoszam+1);
                
            } while (this.lottoSzamok.contains(szam));
            this.lottoSzamok.add(szam);
        }else{
            throw new Exception("kihuzotak");        
        }
        return szam;
    }
    
    public void novekvoberendez(){
        this.lottoSzamok.sort(Integer::compareTo);
    }

    @Override
    public String toString() {
       String s="";
       
       for(int szam: this.lottoSzamok){
        s+=szam+"";
       
       }
       return s;
    }
        
    
   
    
}
