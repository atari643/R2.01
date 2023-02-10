/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author qartigala
 */
public class LotteryTicketIT {
    @Test
    public void testValid(){
        LotteryTicket lt = new LotteryTicket("Albert");
        lt.ordered = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 10, 9, 8, 7));
        lt.unOrdered = new HashSet<>(Arrays.asList(3, 1, 4, 5, 10, 9, 8, 7));
        assertTrue(lt.valid());
        LotteryTicket lt2 = new LotteryTicket("");
        lt2.ordered = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 10, 9, 8, 7));
        lt2.unOrdered = new HashSet<>(Arrays.asList(3, 1, 4, 5, 10, 9, 8, 7));
        assertFalse(lt2.valid());
        LotteryTicket lt3 = new LotteryTicket("Jules");
        lt3.ordered = new ArrayList<>(Arrays.asList(80, 1, 60, 5, 10, 9, 8, 7));
        lt3.unOrdered = new HashSet<>(Arrays.asList(80, 1, 60, 5, 10, 9, 8, 7));
        assertFalse(lt3.valid());
        LotteryTicket lt4 = new LotteryTicket("Jules");
        lt4.ordered = new ArrayList<>(Arrays.asList(30, 1, 20, 5, 10, 9, 8, 7, 41, 25));
        lt4.unOrdered = new HashSet<>(Arrays.asList(30, 1, 20, 5, 10, 9, 8, 7, 10, 41, 25));
        assertFalse(lt4.valid());
        
        
        
        
    }
    
}
