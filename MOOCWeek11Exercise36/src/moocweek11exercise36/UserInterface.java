/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise36;

import java.awt.Container;
import java.awt.Dimension;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class UserInterface implements Runnable{
    private JFrame frame;
    
    public UserInterface(){
        this.frame = new JFrame();
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel text = new JLabel("Hi!");
        container.add(text);
    }
    
    
}
