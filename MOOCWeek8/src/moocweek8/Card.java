/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with Hand.java and SortAgainstSuitAndValue.java classes.

/**
 *
 * @author Trigg
 */
public class Card implements Comparable<Card>{
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;
    private String value;
    private String suit;
    private int valueCompare;
    private int suitCompare;
    
    public Card(int value, int suit){
        this.value = "";
        this.suit = "";
        
        if(value == 14){
            this.value = "A";
        }else if(value == 2){
            this.value = "" + value;
        }else if(value == 3){
            this.value = "" + value;
        }else if(value == 4){
            this.value = "" + value;
        }else if(value == 5){
            this.value = "" + value;
        }else if(value == 6){
            this.value = "" + value;
        }else if(value == 7){
            this.value = "" + value;
        }else if(value == 8){
            this.value = "" + value;
        }else if(value == 9){
            this.value = "" + value;
        }else if(value == 10){
            this.value = "" + value;
        }else if(value == 11){
            this.value = "J";
        }else if(value == 12){
            this.value = "Q";
        }else if(value == 13){
            this.value = "K";
        }
        
        this.valueCompare = value;
        
        if(suit == SPADES){
            this.suit = "Spades";
        }else if(suit == DIAMONDS){
            this.suit = "Diamonds";
        }else if(suit == HEARTS){
            this.suit = "Hearts";
        }else if(suit == CLUBS){
            this.suit = "Clubs";
        }
        
        this.suitCompare = suit;
    }
    
    public String getValue(){
        return this.value;
    }
    
    public String getSuit(){
        return this.suit;
    }
    
    public int getValueCompare(){
        return this.valueCompare;
    }
    
    public int getSuitCompare(){
        return this.suitCompare;
    }
    
    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }

    @Override
    public int compareTo(Card card) {
        if(this.valueCompare == card.getValueCompare()){
            return this.suitCompare - card.getSuitCompare();
        }
        return this.valueCompare - card.getValueCompare();
    }
}