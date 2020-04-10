/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise41;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Trigg
 */
public class DrawingBoard extends JPanel{
    
    public DrawingBoard(){
        super.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.fillRect(125, 50, 50, 50);
        graphics.fillRect(325, 50, 50, 50);
        graphics.fillRect(75, 200, 50, 50);
        graphics.fillRect(375, 200, 50, 50);
        graphics.fillRect(125, 250, 250, 50);
    }
}
