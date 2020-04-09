/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise39;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import clicker.ui.UserInterface;

/**
 *
 * @author Trigg
 */
public class MOOCWeek11Exercise39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new PersonalCalculator();
        UserInterface ui = new UserInterface(calc);
        
        ui.run();
    }
    
}
