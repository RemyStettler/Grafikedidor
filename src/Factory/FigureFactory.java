package Factory;

import Figures.*;
import Figures.Rectangle;

import java.awt.*;

public class FigureFactory {
    private Point firstPoint;
    private Point secondPoint;
    private int xLower;
    private int yLower;
    private int width;
    private int height;

    public Figure getFigure(char figureTyp, Point firstPoint, Point secondPoint, int xLower, int yLower, int width, int height){
        String figuretype = Character.toString(figureTyp);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.xLower = xLower;
        this.yLower = yLower;
        this.width = width;
        this.height = height;

        if(figuretype.equalsIgnoreCase("l")){
            return new Line(firstPoint, secondPoint, Color.BLUE);
        }

        if(figuretype.equalsIgnoreCase("r")){
            return new Rectangle(xLower, yLower, width, height);
        }

        if(figuretype.equalsIgnoreCase("e")){
            return new Ellipse(xLower, yLower, width, height);
        }

        if(figuretype.equalsIgnoreCase("c")){
            return new Circle(xLower, yLower, Circle.calcR(width,height));
        }

        return null;
    }
}

