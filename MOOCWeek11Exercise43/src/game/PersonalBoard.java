/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Trigg
 */
public class PersonalBoard extends GameOfLifeBoard{
    private boolean[][] board;
    private boolean[][] tempStorage;
    
    public PersonalBoard(int height, int length){
        super(height, length);
        this.board = super.getBoard();
        this.tempStorage = new boolean[super.getLength()][super.getHeight()];
    }

    @Override
    public void turnToLiving(int x, int y) {
        this.board[x][y] = true;
    }
    
    @Override
    public boolean[][] getBoard(){
        return this.board;
    }

    @Override
    public void turnToDead(int x, int y) {
        this.board[x][y] = false;
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(this.board[x][y] == true){
            return true;
        }
        
        return false;
    }
    
    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        double num = 0;
        for(int i = 0; i < super.getLength(); i++){
            for(int j = 0; j < super.getHeight(); j++){
                num = (new Random().nextDouble() * 1.0) + 0;
                
                if(num <= probabilityForEachCell){
                    this.board[i][j] = true;
                }else{
                    this.board[i][j] = false;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int num = 0;

        for (int i = 0; i < super.getLength(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {
                try {
                    if (i == x + 1 && j == y && this.board[x + 1][y] == true) {
                        num++;
                    } else if (i == x && j == y + 1 && this.board[x][y + 1] == true) {
                        num++;
                    } else if (i == x - 1 && j == y && this.board[x - 1][y] == true) {
                        num++;
                    } else if (i == x && j == y - 1 && this.board[x][y - 1] == true) {
                        num++;
                    } else if (i == x + 1 && j == y + 1 && this.board[x + 1][y + 1] == true) {
                        num++;
                    } else if (i == x - 1 && j == y - 1 && this.board[x - 1][y - 1] == true) {
                        num++;
                    } else if (i == x - 1 && j == y + 1 && this.board[x - 1][y + 1] == true) {
                        num++;
                    } else if (i == x + 1 && j == y - 1 && this.board[x + 1][y - 1] == true) {
                        num++;
                    }
                } catch (Exception e) {
                    
                }
            }
        }

        return num;
    }
    
    @Override
    public void applyManageCellMethod() {

        for (int x = 0; x < super.getBoard().length; x++) {
            for (int y = 0; y < super.getBoard()[x].length; y++) {
                this.manageCell(x, y, this.getNumberOfLivingNeighbours(x, y));
            }
        }

        for (int i = 0; i < tempStorage.length; i++) {
            for (int j = 0; j < tempStorage[i].length; j++) {
                super.getBoard()[i][j] = tempStorage[i][j];
            }
        }
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(getNumberOfLivingNeighbours(x, y) < 2 || getNumberOfLivingNeighbours(x, y) > 3){
            turnToDead(x, y);
        }else if(getNumberOfLivingNeighbours(x, y) == 3){
            turnToLiving(x, y);
        }
    }
    
    @Override
    public void drawCirles(Graphics graphics) {
        for (int i = 0; i < super.getBoard().length; i++) {
            for (int j = 0; j < super.getBoard()[i].length; j++) {
                int x = 0;
                int y = 0;
                if (i == 0 & j == 0) {
                    x = i * super.getDiameter();
                    y = j * super.getDiameter();
                } else {
                    x = i * super.getDiameter() + 1;
                    y = j * super.getDiameter() + 1;
                }

                if (super.getBoard()[i][j] == true) {
                    graphics.setColor(Color.BLUE);
                    graphics.fillOval(x, y, super.getDiameter(), super.getDiameter());

                } else {
                    graphics.setColor(Color.GREEN);
                    graphics.fillOval(x, y, super.getDiameter(), super.getDiameter());
                }
            }
        }
    }
    
}
