/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Trigg
 */
public class DecreasingCounter {
    private int value;
    public DecreasingCounter(int valueAtStart){
        this.value = valueAtStart;
    }
    
    public void printValue(){
        System.out.println("Value: " + this.value);
    }
    
    public void decrease(){
        this.value--;
        
        if(this.value < 0){
            this.value++;
        }
    }
    
    public void reset(){
        this.value = 0;
    }
}
