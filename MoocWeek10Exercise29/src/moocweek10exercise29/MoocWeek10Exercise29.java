/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek10exercise29;

import people.Person;
import people.Student;
import people.Teacher;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class MoocWeek10Exercise29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
    }
    
    public static void printDepartment(List<Person> people){
        for(Person staff : people){
            System.out.println(staff);
        }
    }
}
