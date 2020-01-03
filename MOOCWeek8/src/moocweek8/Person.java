/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Originally used in javaapplication2.java.
package moocweek8;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int salary;

    public Person(String name, int salary) {
        this.age = 0;
        this.name = name;
        this.salary = salary;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void becomeOlder() {
        this.age = this.age + 1;
    }
    
    public boolean isAdult(){
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    @Override
    public int compareTo(Person person){
        return person.getSalary() - this.salary;
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.getSalary() + ")";
    }
}
