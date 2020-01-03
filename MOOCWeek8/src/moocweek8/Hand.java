/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

//Used in conjunction with Card.java and SortAgainstSuitAndValue.java classes.

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card hand : this.hand){
            System.out.println(hand);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public int totalValue(){
        int bigger = 0;
        for(Card value : this.hand){
            bigger += value.getValueCompare();
        }
        
        return bigger;
    }
    
    @Override
    public int compareTo(Hand hand) {
        return totalValue() - hand.totalValue();
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue sorting = new SortAgainstSuitAndValue();
        
        Collections.sort(this.hand, sorting);
    }
}