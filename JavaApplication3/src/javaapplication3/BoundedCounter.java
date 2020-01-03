/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/* //BoundedCounter counter = new BoundedCounter(14);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter seconds = new BoundedCounter(59);
        
        System.out.print("Hours: ");
        int h = Integer.parseInt(reader.nextLine());
        System.out.print("Minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("Seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        
        hours.setValue(h); 
        minutes.setValue(m);
        seconds.setValue(s);
        
        while ( true ) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
                }
            }
            // put here the logic to advance your clock by one second
        }

        /int i = 0;
        while ( i < 121 && s > 0 && m > 0 && h > 0) {
            System.out.println( hours + ":" + minutes + ":" + seconds); 
            seconds.next();
            if(seconds.getValue() == 0){
                minutes.next();
                if(minutes.getValue() == 0){
                    hours.next();
                }
            }
            
            i++;
        }/
    }*/

/**
 *
 * @author Trigg
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int value, int upperLimit){
        this.value = value;
        this.upperLimit = upperLimit;
    }
    
    public void next(){
        this.value++;
        if(this.value > upperLimit){
            this.value = 0;
        }
    }
    
    public String toString(){
        if(this.value < 10){
            return "0" + this.value;
        }
        
        return "" + this.value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int set){
        this.value = set;
        if(set > upperLimit || set < 0){
            this.value = 0;
            System.out.println("Invalid entry.");
        }
    }
}