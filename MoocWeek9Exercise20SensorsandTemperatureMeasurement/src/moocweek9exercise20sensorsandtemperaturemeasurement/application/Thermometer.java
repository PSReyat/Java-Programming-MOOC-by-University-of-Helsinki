/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise20sensorsandtemperaturemeasurement.application;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Thermometer implements Sensor{
    private int temp;
    private boolean on;
    
    public Thermometer(){
        this.temp = 0;
        this.on = true;
    }
    
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        Random random = new Random();
        this.temp = random.nextInt(60) - 30;
        
        if(isOn() == false){
            throw new IllegalStateException("Thermometer is not on!");
        }
        
        return this.temp;
    }
    
}
