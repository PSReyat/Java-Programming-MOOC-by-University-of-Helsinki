/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();
    }
    
    public void add(Person person){
        this.employees.add(person);
    }
    
    public void add(List<Person> persons){
        this.employees.addAll(persons);
    }
    
    public void print(){
        Iterator<Person> iterate = this.employees.iterator();
        
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }
    
    public void print(Education education){
        for(Person person : this.employees){
            if(person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterate = this.employees.iterator();
        
        while(iterate.hasNext()){
            if(iterate.next().getEducation() == education){
                iterate.remove();
            }
        }
    }
}
