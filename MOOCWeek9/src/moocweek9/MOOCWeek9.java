/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9;

import java.util.*;
import mooc.logic.ApplicationLogic;
import moocweek9.mooc.ui.UserInterface;
import moocweek9.mooc.ui.TextUserInterface;

//Mooc week 9, exercise 17: First Package

/**
 *
 * @author Trigg
 */
public class MOOCWeek9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
    
}
