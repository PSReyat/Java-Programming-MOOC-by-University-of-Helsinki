/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise34;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class FileManager {
    private ArrayList<String> readFile;
    private Scanner reader;
    
    public FileManager(){
        this.readFile = new ArrayList<>();
    }
    
    public ArrayList<String> read(String file) throws Exception{
        File f = new File(file);
        this.reader = new Scanner(f);
        
        while(this.reader.hasNextLine()){
            this.readFile.add(this.reader.nextLine());
        }
        
        return this.readFile;
    }
    
    public void save(String file, ArrayList<String> text) throws Exception{
        FileWriter f = new FileWriter(file);
        
        for(String x : text){
            f.write(x);
        }
        
        f.close();
    }
}
