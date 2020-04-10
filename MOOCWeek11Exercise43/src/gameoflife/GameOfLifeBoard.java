/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Graphics;

/**
 *
 * @author Trigg
 */
public abstract class GameOfLifeBoard {
    private int fieldLength;
    private int diameter;
    private int length;
    private int height;
    
    public GameOfLifeBoard(int height, int length){
        this.length = length;
        this.height = height;
        this.fieldLength = 800;
        this.diameter = fieldLength / 100;
    }
    
    public boolean[][] getBoard(){
        return new boolean[this.length][this.height];
    }
    
    public int getLength(){
        return this.length;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void playTurn(){
        
    }
    
    public int getDiameter() {
        return this.diameter;
    }

    public int getFieldLength() {
        return this.fieldLength;
    }
    
    public abstract void turnToLiving(int x, int y);
    
    public abstract void turnToDead(int x, int y);
    
    public abstract boolean isAlive(int x, int y);
    
    public abstract void initiateRandomCells(double probabilityForEachCell);
    
    public abstract int getNumberOfLivingNeighbours(int x, int y);
    
    public abstract void applyManageCellMethod();
    
    public abstract void manageCell(int x, int y, int livingNeighbours);
    
    public abstract void drawCirles(Graphics graphics);
}
