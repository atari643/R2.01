/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lottery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author qartigala
 */
public class RandomLotteryIT {
    
    @Test
    public void testCompareLists(){
        ArrayList<Integer> empty = new ArrayList<>();
        RandomLottery rd = new RandomLottery();
        int res = rd.compareLists(empty);
        assertEquals(0, res);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1); num.add(4); num.add(10); num.add(11); num.add(14);num.add(15);
        int res2 = rd.compareLists(num);
        assertEquals(10, res2);
    }
    @Test
    public void testCompareSet(){
        HashSet<Integer> empty = new HashSet<>();
        RandomLottery rd = new RandomLottery();
        int res = rd.compareSets(empty);
        assertEquals(0, res);
        HashSet<Integer> setFull = new HashSet<>(Arrays.asList(3, 1, 4, 5, 10, 9));
        RandomLottery randLot = new RandomLottery();
        for(int i = 0; i<RandomLottery.BALLS_TO_DRAW;i++){
            randLot.newBall();
        }
        int res2 = randLot.compareSets(setFull);
        assertEquals(RandomLottery.BALLS_TO_DRAW, res2);
        
        
    }
    
}
