/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author Trigg
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Coding, bro. Going all in; balls deep.\n");
        Scanner reader = new Scanner(System.in);
        
        cardPekka card1 = new cardPekka(20);
        cardBrian card2 = new cardBrian(30);
        
        card1.payGourmet();
        card2.payEconomical();
        System.out.println(card1);
        System.out.println(card2);
        card1.loadMoney(20);
        card2.payGourmet();
        System.out.println(card1);
        System.out.println(card2);
        card1.payEconomical();
        card1.payEconomical();
        card2.loadMoney(50);
        System.out.println(card1);
        System.out.println(card2);
        
        /*LyyraCard card = new LyyraCard(50);
        System.out.println(card);
        
        System.out.println("What would you like, Economical or Gourmet? Or would you like to top-up?");
        String x = reader.nextLine();
        
        if(x.equals("Economical") || x.equals("economical") || x.equals("e")){
            card.payEconomical();
        }else if(x.equals("Gourmet") || x.equals("gourmet") || x.equals("g")){
            card.payGourmet();
        }else if(x.equals("Top-up") || x.equals("Topup") || x.equals("Top up") || x.equals("T") || x.equals("t")){
            System.out.println("How much would you like to top-up?");
            int topUp = Integer.parseInt(reader.nextLine());
            card.loadMoney(topUp);
        }
        
        System.out.println(card);*/
        
    }
   
}
