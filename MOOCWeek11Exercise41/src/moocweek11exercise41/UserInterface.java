/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise41;

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
    
    public UserInterface(){
        this.frame = new JFrame("Smiley");
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
        container.add(new DrawingBoard());
    }
}
