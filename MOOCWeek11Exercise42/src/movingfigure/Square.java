/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Trigg
 */
public class Square extends Figure{
    private int x;
    private int y;
    private int sideLength;
    
    public Square(int x, int y, int sideLength){
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(super.getX(), super.getY(), this.sideLength, this.sideLength);
    }
}
