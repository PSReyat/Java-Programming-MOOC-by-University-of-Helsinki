/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int duplicateDetectable;
    private Set<String> strings;
    
    public PersonalDuplicateRemover(){
        this.duplicateDetectable = 0;
        this.strings = new HashSet<>();
    }
    @Override
    public void add(String characterString) {
        if(!this.strings.contains(characterString)){
            this.strings.add(characterString);
        }else if(this.strings.contains(characterString)) {
            this.duplicateDetectable++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateDetectable;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
        this.strings.clear();
        this.duplicateDetectable = 0;
    }
    
}
