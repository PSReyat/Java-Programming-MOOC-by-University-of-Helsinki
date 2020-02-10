/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise19methodargumentvalidation;

/**
 *
 * @author Trigg
 */
public class MoocWeek9Exercise19MethodArgumentValidation{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Person person1 = new Person("James", 25);
        
        System.out.println(person1.getName() + " " + person1.getAge());
        
        Person person2 = new Person("James", 125);
        
        System.out.println(person2.getName() + " " + person2.getAge());
        */
        
        Calculator calc = new Calculator();
        
        System.out.println(calc.multiplication(87, 23));
        System.out.println(calc.binomialCoefficient(5, 32));
    }
    
}
