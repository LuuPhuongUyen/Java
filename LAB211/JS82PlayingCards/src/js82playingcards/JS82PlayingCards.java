/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js82playingcards;

/**
 *
 * @author PC
 */
public class JS82PlayingCards {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] suits = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int k = 0; k < suits.length; k++) {
                deck[suits.length * i + k] = ranks[i] + " of " + suits[k];
            }
        }
        System.out.println("-------- Random Card --------");
        int r = (int) (Math.random() * (n + 1));
        System.out.println("" + deck[r]);
        System.out.println(" -------- Full Card --------");
        for (int i = 0; i < n; i++) {
            System.out.println("" + deck[i]);
        }
    }
}
