/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Skiers {
    private ArrayList<String> names;
    private HashMap<String, ArrayList<Integer>> scores;
    private ArrayList<Integer> lengths;
    
    public Skiers(){
        this.names = new ArrayList<>();
        this.scores = new HashMap<>();
        this.lengths = new ArrayList<>();
    }
    
    public void addNames(String name){
        this.names.add(name);
    }
    
    public void addLength(String name, int length){
        this.lengths.add(length);
        this.scores.put(name, this.lengths);
    }
    
    public List<String> getNames(){
        return this.names;
    }
    
    public ArrayList<Integer> getLength(String name){
        return this.scores.get(name);
    }
    
    public int getTotalLength(String name){
        if(this.scores.get(name).isEmpty()){
            return 0;
        }
        int total = 0;
        
        for(int i : this.scores.get(name)){
            total += i;
        }
        
        return total;
    }
}
