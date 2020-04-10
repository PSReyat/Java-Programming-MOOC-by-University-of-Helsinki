/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    private Figure figure;
    
    public UserInterface(Figure figure){
        this.figure = figure;
        this.frame = new JFrame();
    }

    @Override
    public void run() {
        this.frame.setPreferredSize(new Dimension(500, 500));   
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void createComponents(Container container){
        DrawingBoard dw = new DrawingBoard(this.figure);
        container.add(dw);
        
        this.frame.addKeyListener(new KeyboardListener(dw, this.figure));
    }
}
