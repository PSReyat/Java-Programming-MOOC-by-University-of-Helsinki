/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek8;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Student implements Comparable<Student>{
    private String name;
    private String studentNumber;
    
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.studentNumber + ")";
    }

    @Override
    public int compareTo(Student student) {
        return this.name.toLowerCase().charAt(0) - student.getName().toLowerCase().charAt(0);
    }
}