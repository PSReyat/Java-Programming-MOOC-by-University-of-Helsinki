/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Trigg
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory ch;
    private double initialVolume;
    
    public ProductContainerRecorder(String productName, double capacity, double intialVolume){
        super(productName, capacity);
        this.initialVolume = initialVolume;
        this.ch = new ContainerHistory();
        this.ch.add(super.currentCapacity);
    }
    
    @Override
    public void addToTheContainer(double amount){
        if(amount < 0){
            
        }else if(amount >= super.originalCapacity){
            super.currentCapacity = 0;
            super.volume = amount;
        }else{
            super.currentCapacity -= amount;
            super.volume += amount;
        }
        
        this.ch.add(super.currentCapacity);
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        if(amount <= 0){
            return 0.0;
        }else if(amount > super.originalCapacity){
            return this.volume;
        }else{
            super.currentCapacity += amount;
            super.volume -= amount;
            this.ch.add(super.currentCapacity);
            return this.volume;
        }
    }
    
    public String history(){
        return this.ch.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.ch);
        System.out.println("Greatest product amount: " + this.ch.maxValue());
        System.out.println("Smallest product amount: " + this.ch.minValue());
        System.out.println("Average: " + this.ch.average());
        System.out.println("Greatest change: " + this.ch.greatestFluctuation());
        System.out.println("Variance: " + this.ch.variance());
    }
}
