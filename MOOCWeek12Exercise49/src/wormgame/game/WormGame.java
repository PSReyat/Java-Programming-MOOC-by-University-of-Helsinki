/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.Timer;
import wormgame.domain.Apple;
import wormgame.domain.Direction;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

/**
 *
 * @author Trigg
 */
public class WormGame extends Timer implements ActionListener{
    private int width;
    private int height;
    private boolean continueGame;
    private Worm worm;
    private Apple apple;
    private Updatable updatable;
    
    public WormGame(int width, int height){
        super(1000, null);
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.apple = new Apple(new Random().nextInt(width + 1), new Random().nextInt(height + 1));
        
        this.width = width;
        this.height = height;
        
        addActionListener(this);
        setInitialDelay(20);
    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int wX = this.worm.getPieces().get(this.worm.getLength() - 1).getX();
        int wY = this.worm.getPieces().get(this.worm.getLength() - 1).getY();
        this.worm.move();
        
        if(this.apple.getAppleX() == wX && this.apple.getAppleY() == wY){
            this.worm.grow();
            
        }else if(this.worm.runsIntoItself()){
            this.continueGame = false;
        }
        
        super.setDelay(1000 / worm.getLength());
        this.updatable.update();
    }
    
    public void setUpdatable(Updatable updatable){
        this.updatable = updatable;
    }
}
