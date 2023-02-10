/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author qartigala
 */
public class RandomLottery {
    Random rand = new Random();
    
    ArrayList<Integer> ordered;
    
    HashSet<Integer> unordered;
    
    
    final static int BALLS_TO_DRAW = 6;
    
    final static int MIN_VALUE = 1;
    
    final static int MAX_VALUE = 49;
    
    RandomLottery(){
        ordered = new ArrayList<>();
        unordered = new HashSet<>();
        rand = new Random(System.currentTimeMillis());
    }
    void newBall(){
        int numberBalls = ordered.size();
        if(numberBalls >=BALLS_TO_DRAW)return;
        int value = rand.nextInt(MAX_VALUE)+1;
        while (unordered.contains(value)){
            value=rand.nextInt(MAX_VALUE)+1;
        }
        ordered.add(value);
        unordered.add(value);
    }
    int compareLists(ArrayList<Integer> list){
        int counter = 0;
        int min = Math.min(list.size(), ordered.size());
        boolean ok = true;
        Integer i, j;
        while(ok && counter<min){
            i=ordered.get(counter);
            j=list.get(counter);
            if(i.equals(j)){
                counter++;
            }
            else{
                ok=false;
            }
        }
        return counter;
    }
    public int compareSets(HashSet<Integer> set){
        int counter = 0;
        for(Integer value: unordered){
            if(set.contains(value)){
                counter++;
            }
        }
        return counter;
    }
}
