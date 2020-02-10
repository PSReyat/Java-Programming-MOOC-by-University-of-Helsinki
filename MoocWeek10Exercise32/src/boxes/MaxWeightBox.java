/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }
    
    @Override
    public void add(Thing thing){
        int j = 0;
        
        for(int i = 0; i < this.things.size(); i++){
            j += this.things.get(i).getWeight();
        }
        
        if(j < this.maxWeight){
            this.things.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        for(Thing find : this.things){
            if(find.equals(thing)){
                return true;
            }
        }
        
        return false;
    }
}
