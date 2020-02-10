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
public interface MultipleEntryDictionary {
    public void add(String word, String entry);
    public Set<String> translate(String word);
    public void remove(String word);
}
