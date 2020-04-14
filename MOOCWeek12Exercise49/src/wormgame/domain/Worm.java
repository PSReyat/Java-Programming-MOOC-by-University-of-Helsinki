/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class Worm {
    private int oX;
    private int oY;
    private Direction oD;
    private List<Piece> wormPieces;
    private Piece piece;
    private int newX;
    private int newY;
    private boolean growth;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.oX = originalX;
        this.oY = originalY;
        this.oD = originalDirection;
        this.wormPieces = new ArrayList<>();
        
        this.wormPieces.add(new Piece(this.oX, this.oY));
    }

    public Direction getDirection(){
        return this.oD;
    }
    
    public void setDirection(Direction dir){
        this.oD = dir;
    }
    
    public int getLength(){
        return getPieces().size();
    }
    
    public List<Piece> getPieces(){
        return this.wormPieces;
    }
 
    public void move() {
        this.newX = this.wormPieces.get(this.wormPieces.size() - 1).getX();
        this.newY = this.wormPieces.get(this.wormPieces.size() - 1).getY();
        
        if(this.growth){
            this.wormPieces.add(this.piece);
        }
     
        if (this.growth == false) {
            if (getDirection() == Direction.RIGHT) {
                this.wormPieces.add(new Piece(newX + 1, newY));

            } else if (getDirection() == Direction.LEFT) {
                this.wormPieces.add(new Piece(newX - 1, newY));

            } else if (getDirection() == Direction.UP) {
                this.wormPieces.add(new Piece(newX, newY - 1));

            } else if (getDirection() == Direction.DOWN) {
                this.wormPieces.add(new Piece(newX, newY + 1));

            }

            if (getLength() > 3) {
                this.wormPieces.remove(0);
            }
        }
        
        this.growth = false;
    }
    
    public void grow() {
        this.newX = this.wormPieces.get(this.wormPieces.size() - 1).getX();
        this.newY = this.wormPieces.get(this.wormPieces.size() - 1).getY();
        
        if (getDirection() == Direction.RIGHT) {
            this.piece = new Piece(newX + 1, newY);

        } else if (getDirection() == Direction.LEFT) {
            this.piece = new Piece(newX - 1, newY);

        } else if (getDirection() == Direction.UP) {
            this.piece = new Piece(newX, newY - 1);

        } else if (getDirection() == Direction.DOWN) {
            this.piece = new Piece(newX, newY + 1);

        }
        
        this.growth = true;
    }
    
    public boolean runsInto(Piece piece){
        int x = this.wormPieces.get(this.wormPieces.size() - 1).getX();
        int y = this.wormPieces.get(this.wormPieces.size() - 1).getY();
        
        if(piece.getX() == x && piece.getY() == y){
            return true;
        }
        
        return false;
    }
    
    public boolean runsIntoItself(){
        for(int i = 0; i < this.wormPieces.size(); i++){
            for(int j = 0; j < this.wormPieces.size(); j++){
                if(this.wormPieces.get(i).runsInto(this.wormPieces.get(j)) && i != j){
                    return true;
                }
            }
        }
        
        return false;    
    }
    
    public Piece wormHead(){
        return this.wormPieces.get(0);
    }
}
