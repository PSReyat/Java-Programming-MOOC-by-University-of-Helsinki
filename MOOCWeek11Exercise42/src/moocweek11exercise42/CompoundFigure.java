/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise42;

import java.awt.Graphics;
import movingfigure.Figure;
import java.util.*;
import movingfigure.Box;
import movingfigure.Circle;

/**
 *
 * @author Trigg
 */
public class CompoundFigure extends Figure{
    private ArrayList<Figure> compoundShape;
    
    public CompoundFigure(){
        super(50, 100);
        this.compoundShape = new ArrayList<>();
    }
    
    public void add(Figure f){
        this.compoundShape.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for(Figure figure : this.compoundShape){
            figure.draw(graphics);
        }
    }
    
    @Override
    public void move(int x, int y){
        for(Figure figure : this.compoundShape){
            figure.move(x, y);
        }
    }
    
}
