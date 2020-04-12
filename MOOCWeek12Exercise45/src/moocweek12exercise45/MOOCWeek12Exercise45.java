/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek12exercise45;

import personnel.Education;
import personnel.Employees;
import personnel.Person;

/**
 *
 * @author Trigg
 */
public class MOOCWeek12Exercise45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print();
    }
    
}
