/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class Analysis {
    private File file;
    private Scanner reader;
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws Exception{
        this.reader = new Scanner(this.file);
        int numberOfLines = 0;
        
        while(this.reader.hasNextLine()){
            numberOfLines++;
            this.reader.nextLine();
        }
        
        this.reader.close();
        
        return numberOfLines;
    }
    
    public int characters() throws Exception{
        this.reader = new Scanner(this.file);
        int numberOfCharacters = 0;
        String word = "";
        while(this.reader.hasNextLine()){
            word = this.reader.nextLine();
            numberOfCharacters += word.length();
            numberOfCharacters++;
        }
        
        this.reader.close();
        
        return numberOfCharacters;
    }
}
