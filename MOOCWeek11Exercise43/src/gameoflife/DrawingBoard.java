/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Trigg
 */
public class DrawingBoard extends JPanel implements ActionListener{
    private GameOfLifeBoard gameBoard;
    Timer tm = new Timer(50, this);

    public DrawingBoard(GameOfLifeBoard gameBoard) {
        super.setBackground(Color.WHITE);
        this.gameBoard = gameBoard;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.gameBoard.drawCirles(graphics);
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.gameBoard.applyManageCellMethod();
        repaint();
    }
}
