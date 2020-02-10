/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class OneThingBox extends Box{
    private Thing[] oneThing;
    
    public OneThingBox(){
        this.oneThing = new Thing[1];
    }
    
    @Override
    public void add(Thing thing) {
        if(this.oneThing[0] == null){
            this.oneThing[0] = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.oneThing[0].equals(thing)){
            return true;
        }
        
        return false;
    }
    
}
