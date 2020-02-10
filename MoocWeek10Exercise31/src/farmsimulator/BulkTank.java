/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Trigg
 */
public class BulkTank {
    private double originalCapacity;
    private double currentCapacity;
    private double volume;
    
    public BulkTank(){
        this.originalCapacity = 2000;
        this.currentCapacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.originalCapacity = capacity;
        this.currentCapacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.originalCapacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.currentCapacity;
    }
    
    public void addToTank(double amount){
        if(amount > this.originalCapacity){
            this.currentCapacity = 0;
            this.volume = this.originalCapacity;
        }else if(amount < 0){
            System.out.println("You can't have negative amounts!");
        }else{
            this.currentCapacity -= amount;
            this.volume += amount;
        }
        
    }
    
    public double getFromTank(double amount){
        if(amount < 0){
            System.out.println("You can't have negative amounts!");
        }else if(amount > this.volume){
            this.currentCapacity = this.originalCapacity;
            this.volume = 0;
        }else{
            this.currentCapacity += amount;
            this.volume -= amount;
            
            return this.volume;
        }
        
        return 0;
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume) + "/" + this.originalCapacity;
    }
    
}
