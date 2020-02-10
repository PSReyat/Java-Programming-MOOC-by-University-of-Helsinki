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
public class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("The name does not follow the guidelines for a regular name.");
        }else if(age < 0 || age > 120){
            throw new IllegalArgumentException("That is an impossible age.");
        }
        
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
}
