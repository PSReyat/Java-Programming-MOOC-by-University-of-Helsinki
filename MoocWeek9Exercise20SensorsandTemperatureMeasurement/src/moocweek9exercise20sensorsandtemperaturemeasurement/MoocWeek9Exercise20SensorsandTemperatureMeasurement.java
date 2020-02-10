/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise20sensorsandtemperaturemeasurement;

import moocweek9exercise20sensorsandtemperaturemeasurement.application.AverageSensor;
import moocweek9exercise20sensorsandtemperaturemeasurement.application.ConstantSensor;
import moocweek9exercise20sensorsandtemperaturemeasurement.application.Sensor;
import moocweek9exercise20sensorsandtemperaturemeasurement.application.Thermometer;

/**
 *
 * @author Trigg
 */
public class MoocWeek9Exercise20SensorsandTemperatureMeasurement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

        System.out.println("readings: " + helsinkiArea.readings());
        
    }
    
}
