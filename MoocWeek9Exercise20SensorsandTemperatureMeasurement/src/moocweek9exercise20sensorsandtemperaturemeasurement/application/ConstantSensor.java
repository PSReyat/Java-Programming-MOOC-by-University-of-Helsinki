/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise20sensorsandtemperaturemeasurement.application;

/**
 *
 * @author Trigg
 */
public class ConstantSensor implements Sensor{
    private int count;
    
    public ConstantSensor(int count){
        this.count = count;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.count;
    }
    
}
