/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author Trigg
 */
public class NoticeBoard implements Runnable{
    private JFrame frame;
    
    public NoticeBoard(){
        this.frame = new JFrame("Notice Board");
    }
    
    @Override
    public void run(){
        this.frame.setPreferredSize(new Dimension(500, 300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void createComponents(Container container){
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextArea top = new JTextArea("This was copied from the top!");
        JTextArea bottom = new JTextArea();
        JButton copyButton = new JButton("Copy!");
        
        MessageListener ml = new MessageListener(top, bottom);
        copyButton.addActionListener(ml);
        
        container.add(top);
        container.add(copyButton);
        container.add(bottom);
    }
}
