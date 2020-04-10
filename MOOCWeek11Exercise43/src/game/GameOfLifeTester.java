/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.*;

/**
 *
 * @author Trigg
 */
public class GameOfLifeTester {
    private GameOfLifeBoard board;
    private Scanner reader;
    
    public GameOfLifeTester(GameOfLifeBoard board){
        this.board = board;
        this.reader = new Scanner(System.in);
    }
    
    public void play(){
        System.out.print("Press enter to continue, otherwise quit: ");
        while (this.reader.nextLine().equals("e")) {
            if(this.reader.nextLine().equals("q")){
                break;
            }
            
            for (int i = 0; i < this.board.getLength(); i++) {
                for (int j = 0; j < this.board.getHeight(); j++) {
                    if (this.board.getBoard()[i][j] == true) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
            
            System.out.print("Press enter to continue, otherwise quit: ");
        }
        
        System.out.println("Thanks!");
    }
}
