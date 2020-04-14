/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Trigg
 */
public class Apple extends Piece{
    private int x;
    private int y;
    
    public Apple(int x, int y){
        super(x, y);
        
        this.x = x;
        this.y = y;
    }
    
    public int getAppleX(){
        return this.x;
    }
    
    public int getAppleY(){
        return this.y;
    }
}
