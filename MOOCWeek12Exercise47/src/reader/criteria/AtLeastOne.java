/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class AtLeastOne implements Criterion{
    private Criterion[] c1;
    private int track;
    
    public AtLeastOne(Criterion... c1){
        this.c1 = c1;
        this.track = 0;
    }
    
    @Override
    public boolean complies(String line) {
        for(Criterion criteria : this.c1){
            if(criteria.complies(line)){
                return true;
            }
        }
        
        return false;
    }
    
}
