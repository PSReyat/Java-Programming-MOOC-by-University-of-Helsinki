/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek12exercise44;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class MOOCWeek12Exercise44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String daysOfTheWeek = reader.nextLine();
        
        if(clockTime(daysOfTheWeek) == true){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is wrong.");
        }
        
    }
    
    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tues|wednes|thurs|fri|satur|sun")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u)?(a|e|i|o|u)?(a|e|i|o|u)?(a|e|i|o|u)?(a|e|i|o|u)?")){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean clockTime(String string){
        String array1[] = string.split(":");
        String hours = array1[0];
        String minutes = array1[1];
        String seconds = array1[2];
        
        if(hours.matches("[0-2][0-3]") && minutes.matches("[0-5][0-9]") && seconds.matches("[0-5][0-9]")){
            return true;
        }else{
            return false;
        }
    }
    
}
