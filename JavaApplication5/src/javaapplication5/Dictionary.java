/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with TextUserInterface.java class.

/**
 *
 * @author Trigg
 */
public class Dictionary {
    private HashMap<String, String> trans;
    
    public Dictionary(){
        this.trans = new HashMap<>();
    }
    
    public String translate(String word){
        if(this.trans.containsKey(word)){
            return this.trans.get(word);
        }
        
        return null;
    }
    
    public void add(String word, String translation){
        this.trans.put(word, translation);
    }
    
    public int amountOfWords(){
        int amount = 0;
        for(String x : this.trans.keySet()){
            amount++;
        }
        
        return amount;
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<>();
        for(String y : this.trans.keySet()){
            list.add(y + " = " + this.trans.get(y));
        }
        
        return list;
    }
}
