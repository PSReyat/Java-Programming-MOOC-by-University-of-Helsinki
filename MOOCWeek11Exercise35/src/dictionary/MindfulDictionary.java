/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class MindfulDictionary {
    private Map<String, String> translate;
    private File f;
    private Scanner reader;
    private FileWriter fw;
    
    public MindfulDictionary(){
        this.translate = new HashMap<>();
    }
    
    public MindfulDictionary(String file) throws Exception{
        this.f = new File(file);
        this.fw = new FileWriter(file);
    }
    
    public boolean load(){
        if(!this.f.canRead()){
            return false;
        }
        
        return true;
    }
    
    public void add(String word, String translation){
        if(!this.translate.containsKey(word)){
            this.translate.put(word, translation);
        }
    }
    
    /*
    for(String x : this.translate.keySet()){
            if(this.translate.get(x).equals(word)){
                return x;
            }
        }
        
        return this.translate.get(word);
    */
    
    public String translate(String word) throws Exception{
        this.reader = new Scanner(this.f);
        String line = "";
        String[] parts;
        while(this.reader.hasNextLine()){
            line = this.reader.nextLine();
            parts = line.split(":");
            
            if(parts[0].equals(word)){
                return parts[1];
            }else if(parts[1].equals(word)){
                return parts[0];
            }
        }
        
        this.reader.close();
        
        return null;
    }
    
    public void remove(String word){
        for(String x : this.translate.keySet()){
            if(this.translate.get(x).equals(word)){
                this.translate.remove(x);
                break;
            }
        }
        
        this.translate.remove(word);
    }
    
    public boolean save(){
        if(!this.reader.hasNextLine()){
            return false;
        }
        
        return true;
    }
}
