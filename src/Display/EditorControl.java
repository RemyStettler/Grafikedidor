package Display;

import Drawing.Drawing;
import Factory.FigureFactory;
import Figures.*;
import Figures.Rectangle;

import java.awt.*;

public final class EditorControl {
    private Drawing drawing = new Drawing();
    private char figureType;
    private Point firstPoint;

    public void repaintAll(Graphics g) {
        drawing.drawFigures(g);
    }

    public void setFigureType(char figureType) {
        this.figureType = figureType;
        System.out.println(figureType);
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void createFigureWithSecondPoint(Point secondPoint) {
        int xLower, yLower, xHigher, yHigher;

        if (firstPoint.x < secondPoint.x) {
            xLower = firstPoint.x;
            xHigher = secondPoint.x;
        } else {
            xHigher = firstPoint.x;
            xLower = secondPoint.x;
        }

        if (firstPoint.y < secondPoint.y) {
            yLower = firstPoint.y;
            yHigher = secondPoint.y;
        } else {
            yHigher = firstPoint.y;
            yLower = secondPoint.y;
        }

        int width = xHigher - xLower;
        int height = yHigher - yLower;

        FigureFactory factory = new FigureFactory();

        Figure figure = factory.getFigure(figureType, firstPoint, secondPoint, xLower, yLower, width, height);

        try {
            if (figure.equals(null)) {

            } else {
                this.drawing.add(figure);
            }
        } catch (Exception e) {
            System.out.println("Kein gültiger Typ");
        }
    }
}
