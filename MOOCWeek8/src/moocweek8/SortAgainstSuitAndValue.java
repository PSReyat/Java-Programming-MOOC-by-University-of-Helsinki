/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with Card.java and Hand.java classes.

/**
 *
 * @author Trigg
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{
    
    @Override
    public int compare(Card card1, Card card2) {
        /*
        if(card1.getValueCompare() == card2.getValueCompare()){
            return card1.getSuitCompare() - card2.getSuitCompare();
        }
        
        return card1.getValueCompare() - card2.getValueCompare();
        */
        
        return card1.getSuitCompare()- card2.getSuitCompare();
    }
}