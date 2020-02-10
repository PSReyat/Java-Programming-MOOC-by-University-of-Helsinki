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
public interface Sensor {
    boolean isOn();  // returns true if the sensor is on
    void on();       // switches the sensor on
    void off();      // switches the sensor off
    int measure();   // returns the sensor reading if the sensor is on
                     // if the sensor is off, it throws an IllegalStateException
}
