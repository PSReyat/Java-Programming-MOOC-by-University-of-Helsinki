/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Trigg
 */
public class WordInspection {
    private File file;
    private Scanner reader;

    public WordInspection(File file) throws Exception {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        this.reader = new Scanner(this.file, "UTF-8");
        int numberOfWords = 0;
        String word = "";
        while (this.reader.hasNextLine()) {
            word = this.reader.nextLine();
            numberOfWords++;
        }

        this.reader.close();

        return numberOfWords;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> wordsWithZ = new ArrayList<>();
        String word = "";
        while(this.reader.hasNextLine()){
            word = this.reader.nextLine();
            
            if(word.contains("z") || word.contains("Z")){
                wordsWithZ.add(word);
            }
        }
        
        this.reader.close();
        
        return wordsWithZ;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException {
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> wordsEndingInL = new ArrayList<>();
        String word = "";
        while (this.reader.hasNextLine()) {
            word = this.reader.nextLine();

            if (word.charAt(word.length() - 1) == 'l' || word.charAt(word.length() - 1) == 'L') {
                wordsEndingInL.add(word);
            }

        }
        
        this.reader.close();
        
        return wordsEndingInL;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> palindrome = new ArrayList<>();
        
        String word = "";
        String reverseWord = "";
        while(this.reader.hasNextLine()){
            word = this.reader.nextLine();
            
            for(int i = 0; i < word.length(); i++){
                reverseWord = word.replace(word.charAt(i), word.charAt(word.length() - 1 - i));
            }
            
            if(word.equals(reverseWord)){
                palindrome.add(word);
            }
        }
        
        return palindrome;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        this.reader = new Scanner(this.file, "UTF-8");
        List<String> wordWithAllVowels = new ArrayList<>();
        
        String word = "";
        
        while(this.reader.hasNextLine()){
            word = this.reader.nextLine();
            
            if(word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u")
                    && word.contains("y") && word.contains("ä") && word.contains("ö")){
                wordWithAllVowels.add(word);
            }
        }
        
        return wordWithAllVowels;
    }
}
