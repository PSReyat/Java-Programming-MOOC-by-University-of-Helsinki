/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        return Collections.max(this.history);
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        return Collections.min(this.history);
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        double store = 0;
        double avg = 0;
        for(double x : this.history){
            store += x;
        }
        
        avg = store/this.history.size();
        
        return avg;
    }
    
    public double greatestFluctuation(){
        List<Double> storing = new ArrayList<>();
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        
        double largestAbsValue = 0;
        double difference = 0;
        
        for(int i = 0; i < this.history.size(); i++){
            try{
                difference = this.history.get(i) - this.history.get(i + 1);
                difference = Math.abs(difference);
                storing.add(difference);
            }catch(Exception e){
                difference = this.history.get(this.history.size() - 2) - this.history.get(this.history.size() - 1);
                difference = Math.abs(difference);
                storing.add(difference);
            }
        }
        
        Collections.sort(storing);
        
        largestAbsValue = storing.get(this.history.size() - 1);
        
        return largestAbsValue;
    }
    
    public double variance(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        
        double i = 0;
        double var = 0;
        
        for(double x : this.history){
            i += Math.pow(x - average(), 2);
        }
        
        var = i/(this.history.size() - 1);
        
        return var;
    }
    
    @Override
    public String toString(){
        return this.history + "";
    }
}
