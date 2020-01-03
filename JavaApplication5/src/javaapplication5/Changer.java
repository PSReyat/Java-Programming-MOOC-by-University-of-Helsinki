/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with Change.java class.

/**
 *
 * @author Trigg
 */
public class Changer {
    private String characterString;
    private ArrayList<Change> changes;
    
    public Changer(){
        this.characterString = "";
        this.changes = new ArrayList<>();
    }
    
    public void addChange(Change change){
        this.changes.add(change);
    }
    
    public String change(String characterString){
        this.characterString = characterString;
        for(Change change: changes){
            this.characterString = change.change(this.characterString);
        }
        
        return this.characterString;
    }
}
