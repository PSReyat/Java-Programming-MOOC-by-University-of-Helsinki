/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Trigg
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame game;
    private int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength){
        this.game = game;
        this.pieceLength = pieceLength;
        super.setBackground(Color.GRAY);
    }
    
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        
        graphics.setColor(Color.red);
        graphics.fillOval(this.game.getApple().getAppleX(), this.game.getApple().getAppleY(), 20, 20);
     
        for (Piece piece : this.game.getWorm().getPieces()) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(piece.getX(), piece.getY(), this.game.getWidth(), this.game.getHeight(), true);
        }

    }

    @Override
    public void update() {
        super.repaint();
    }
}
