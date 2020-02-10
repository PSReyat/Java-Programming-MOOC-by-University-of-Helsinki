/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek9exercise21printer;

import java.io.File;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class Printer {
    private Scanner reader;
    private File text;
    
    public Printer(String fileName) throws Exception{
        this.text = new File(fileName);
        
    }
    
    /*
    the reason the scanner wasn't reading the .txt file was because the .txt file
    was encoded in ANSI and not UTF-8.
    */
    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(this.text, "UTF-8");
        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();

            if (line.contains(word)) {
                System.out.println(line);
            } else if (word.isEmpty()) {
                System.out.println(line);
            }
        }
        
        this.reader.close();
    }
}
