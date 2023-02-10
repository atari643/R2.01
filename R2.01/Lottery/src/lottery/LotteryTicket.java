/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author qartigala
 */
public class LotteryTicket {
    
    String PlayerName;
    
    ArrayList<Integer> ordered;
    
    HashSet<Integer> unOrdered;
    
    int numberOfNumber = 0;
    
    final static int MAX_NUMBERS = 9;

    public LotteryTicket(String name) {
        PlayerName = name;
    }
    boolean valid(){
        boolean ok = true;
        if(ordered.size()!=unOrdered.size())return false;
        if(PlayerName==null)return false;
        if(ordered.size()>MAX_NUMBERS)return false;
        if(PlayerName.equals(""))return false;
        for(Integer value: unOrdered){
            if(value<RandomLottery.MIN_VALUE){
                ok=false;
            }
            if(value>RandomLottery.MAX_VALUE){
                ok=false;
            }
            if(!ordered.contains(value)){
                ok=false;
            }
        }
        return ok;
    }
    void newNumber(int nombre){
        
    }
    
    
    
}
