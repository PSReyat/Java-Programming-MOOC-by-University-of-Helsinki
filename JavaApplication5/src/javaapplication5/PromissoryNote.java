/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.HashMap;

/**
 *
 * @author Trigg
 */
public class PromissoryNote {
    private HashMap<String, Double> person;
    
    public PromissoryNote(){
        this.person = new HashMap<>();
    }
    
    public void setLoan(String toWhom, double value){
        this.person.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        
        if(this.person.containsKey(whose)){
            return this.person.get(whose);
        }
        
        return 0;
    }
}
