/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class Simulator implements Runnable{
    private JFrame frame;
    private GameOfLifeBoard gameBoard;

    public Simulator(GameOfLifeBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.gameBoard.initiateRandomCells(0.6);
    }
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        DrawingBoard board = new DrawingBoard(this.gameBoard);
        container.add(board);
        container.setPreferredSize(new Dimension(this.gameBoard.getFieldLength(), this.gameBoard.getFieldLength()));
    }
}
