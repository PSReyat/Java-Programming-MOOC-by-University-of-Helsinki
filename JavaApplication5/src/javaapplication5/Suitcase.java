/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;

//Used in conjunction with Container.java and Thing.java classes.

/**
 *
 * @author Trigg
 */
public class Suitcase {
    private static int MASS_LIMIT;
    private ArrayList<Thing> thing;
    
    public Suitcase(int limit){
        this.MASS_LIMIT = limit;
        this.thing = new ArrayList<>();
    }
    
    public void addThing(Thing thing){
        this.thing.add(thing);
        
        if(totalMass() > this.MASS_LIMIT){
            this.thing.remove(thing);
        }
    }
    
    public String toString(){
        if(this.thing.size() == 0){
            return "Empty" + " (" + this.thing.get(this.thing.size() - 1) + ")";
        }else if(this.thing.size() == 1){
            return this.thing.size() + " thing " + " (" + this.thing.get(this.thing.size() - 1) + ")";
        }
        return this.thing.size() + " things " + " (" + this.thing.get(this.thing.size() - 1) + ")";
    }
    
    public void printThings(){
        for(Thing single : this.thing){
            System.out.println(single);
        }
    }
    
    public int totalMass(){
        int add = 0;
        for(int i = 0; i < this.thing.size(); i++){
            add += this.thing.get(i).getMass();
        }
        
        return add;
    }
    
    public Thing heaviestThing(){
        Thing thing;
        thing = this.thing.get(0);
        for(int i = 0; i < this.thing.size(); i++){
            if(thing.getMass() < this.thing.get(i).getMass()){
                thing = this.thing.get(i);
            }
                    
        }
        
        return new Thing(thing.getName(), thing.getMass());
    }
}
