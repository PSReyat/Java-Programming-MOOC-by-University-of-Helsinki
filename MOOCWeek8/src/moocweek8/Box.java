/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

//Used in conjunction with CD.java class, Book.java class and the ToBeStored.java interface.

/**
 *
 * @author Trigg
 */
public class Box implements ToBeStored{
    private double weight;
    private double mass;
    private ArrayList<ToBeStored> things;
    
    public Box(double weight){
        this.mass = 0;
        this.weight = weight;
        this.things = new ArrayList<>();
    }
    
    public void add(ToBeStored stuff){
        this.things.add(stuff);
        
        if(weight() > this.weight){
            System.out.println("You've exceeded the weight limit of the box.\nRemoved item: " + stuff);
            this.things.remove(stuff);
        }
    }
    
    @Override
    public double weight() {
        double add = 0;
        for(int i = 0; i < this.things.size(); i++){
            add += this.things.get(i).weight();
        }
        
        return add;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.things.size() + ", total weight: " + weight() + "kg";
    }
    
}
