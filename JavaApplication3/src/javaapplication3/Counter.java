/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Trigg
 */

/*      System.out.print("Enter a starting value: ");
        int x = Integer.parseInt(reader.nextLine());
        Counter count = new Counter(x);
        
        System.out.print("Would you like to increase, or decrease this value: ");
        String inDe = reader.nextLine();
        
        System.out.print("Please state by how much would you like to increase or decrease it: ");
        int i = Integer.parseInt(reader.nextLine());
        
        int control = 0;
        
        while(control < i){
            if(inDe.equals("increase") || inDe.equals("Increase") || inDe.equals("I") || inDe.equals("i")){
                count.increase();
            }else if(inDe.equals("decrease") || inDe.equals("Decrease") || inDe.equals("D") || inDe.equals("d")){
                count.decrease();
            }
            
            control++;
        }
        
        System.out.println(count.value());*/

public class Counter {
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.startingValue;
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void decrease(){
        this.decrease(1);
        
        if(this.startingValue < 0){
            this.check = true;
            
            if(this.check = true){
                this.increase(1);
            }
        }
        
        
    }
    
    public void increase(int increaseAmount){
        this.startingValue = this.startingValue + increaseAmount;
    }
    
    public void decrease(int decreaseAmount){
        this.startingValue = this.startingValue - decreaseAmount;
    }
}
