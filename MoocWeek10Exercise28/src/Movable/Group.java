/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movable;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Group implements Movable{
    private int x;
    private int y;
    private List<Movable> organism;
    
    public Group(){
        this.x = x;
        this.y = y;
        this.organism = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        for(int i = 0; i < this.organism.size(); i++){
            System.out.print(this.organism.get(i));
            
            if(i == this.organism.size() - 1){
                break;
            }
            
            System.out.println();
        }
        
        return "";
    }
    
    public void addToGroup(Movable movable){
        this.organism.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        
    }
    
}
