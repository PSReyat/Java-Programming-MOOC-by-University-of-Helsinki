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
public class Container {
    protected double originalCapacity;
    protected double currentCapacity;
    protected double volume;
    
    public Container(double capacity){
        this.originalCapacity = capacity;
        if(this.originalCapacity <= 0){
            this.originalCapacity = 0;
        }
        this.currentCapacity = capacity;
        this.volume = 0;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double getOriginalCapacity(){
        return this.originalCapacity;
    }
    
    public double getCurrentCapacity(){
        return this.currentCapacity;
    }
    
    public void addToTheContainer(double amount){
        if(amount < 0){
            System.out.println("Can't have negative amounts.");
        }else if(amount >= this.originalCapacity){
            this.currentCapacity = 0;
            this.volume = amount;
        }else{
            this.currentCapacity -= amount;
            this.volume += amount;
        }
    }
    
    public double takeFromTheContainer(double amount){
        if(amount <= 0){
            return 0.0;
        }else if(amount > this.originalCapacity){
            return this.volume;
        }else{
            this.currentCapacity += amount;
            this.volume -= amount;
            return this.volume;
        }
    }
    
    @Override
    public String toString(){
        return "Volume occupied in the container: " + getVolume() + " units cubed."+ 
                "\nFree space left in the container: " + getCurrentCapacity() + " units cubed.";
    }
}
