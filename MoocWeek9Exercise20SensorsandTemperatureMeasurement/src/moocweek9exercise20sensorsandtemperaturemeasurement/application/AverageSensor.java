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
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private boolean onOrOff;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.onOrOff = true;
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for(Sensor sense : this.sensors){
            if(sense.isOn() == false){
                off();
                break;
            }
        }
        return this.onOrOff;
    }

    @Override
    public void on() {
        this.onOrOff = true;
    }

    @Override
    public void off() {
        this.onOrOff = false;
    }

    @Override
    public int measure() {
        if(isOn() == false){
            throw new IllegalStateException("A sensor is turned off.");
        }else if(this.sensors.isEmpty()){
            throw new IllegalStateException("There are no sensors!");
        }
        
        int i = 0;
        for(Sensor sense : this.sensors){
            
            i += sense.measure();
        }
        int avg = i / this.sensors.size();
        
        this.readings.add(avg);
        
        return avg;
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
