/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> multipleDictionary;
    
    public PersonalMultipleEntryDictionary(){
        this.multipleDictionary = new HashMap<>();
    }
    
    @Override
    public void add(String word, String translate){
        if(!this.multipleDictionary.containsKey(word)){
            this.multipleDictionary.put(word, new HashSet<>());
        }
        
        this.multipleDictionary.get(word).add(translate);
    }

    @Override
    public Set<String> translate(String word) {
        return this.multipleDictionary.get(word);
    }

    /**
     *
     * @param word
     */
    @Override
    public void remove(String word) {
        this.multipleDictionary.remove(word);
    }
    
    
}
