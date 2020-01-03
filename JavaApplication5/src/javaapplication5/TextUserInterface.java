/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.*;

//Used in conjunction with Dictionary.java class

/**
 *
 * @author Trigg
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        reader = new Scanner(System.in);
        dictionary = new Dictionary();
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statement:\n" + "  quit - quit the user interface\n  translate - "
                + "asks a word and prints its translation\n  add - adds a word pair to the dictionary\n");
        
        System.out.print("Statement: ");
        String statement = this.reader.nextLine();
        
        while(true){
            if(statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(statement.equals("add")){
                add();
            }else if(statement.equals("translate")){
                translate();
            }
            else{
                System.out.println("Unknown statement");
            }
            
            System.out.println();
            
            System.out.print("Statement: ");
            statement = this.reader.nextLine();
            
        }
    }
    
    public void add(){
        String word = "";
        String tWord = "";
        System.out.print("In Finnish: ");
        word = this.reader.nextLine();
        System.out.print("In English: ");
        tWord = this.reader.nextLine();
        this.dictionary.add(word, tWord);
    }
    
    public void translate(){
        String word = "";
        System.out.print("Give a word: ");
        word = this.reader.nextLine();
        System.out.print("Translation in English: " + this.dictionary.translate(word));
        System.out.println();
    }
    
}
