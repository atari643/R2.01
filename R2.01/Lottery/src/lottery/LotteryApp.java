/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottery;

import java.util.ArrayList;

/**
 *
 * @author qartigala
 */
public class LotteryApp {

    ArrayList<LotteryTicket> tickets;

    RandomLottery lottery;
    
    LotteryTicket currentWinner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    void newGame() {
        tickets = new ArrayList<>();
        lottery = new RandomLottery();
        currentWinner=null;
    }

}
