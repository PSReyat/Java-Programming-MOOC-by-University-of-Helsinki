/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise21printer;

import java.io.File;
import java.util.*;
import wordinspection.WordInspection;

/**
 *
 * @author Trigg
 */
public class MoocWeek9Exercise21Printer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        File file = new File("src/shortList.txt");
        WordInspection inspect = new WordInspection(file);
        
        System.out.println("Number of words in this document: " + inspect.wordCount());
        System.out.println("Words containing the letter 'Z': " + inspect.wordsContainingZ());
        System.out.println("Words ending in the letter 'l': " + inspect.wordsEndingInL());
        System.out.println("Words that are also palindromes: " + inspect.palindromes());
        System.out.println("Words that have all the Finnish vowels: " + inspect.wordsWhichContainAllVowels());
    }
    
}
