package org.example;

import java.util.ArrayList;

class ShapeArray {
    private Shape[] shapeList;
    private int nbShapes;

    public ShapeArray(int size) {
        shapeList = new Shape[size];
        nbShapes = 0;
    }

    public boolean addShape(Shape s) {
        if (nbShapes < shapeList.length) {
            shapeList[nbShapes++] = s;
            return true;
        }
        return false;
    }

    public int getCircleCounter() {
        int count = 0;
        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Circle) {
                count++;
            }
        }
        return count;
    }

    public double getAvgAreas() {
        double totalArea = 0.0;
        int shapeCount = 0;

        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Circle) {
                Circle c = (Circle) shapeList[i];
                totalArea += Math.PI * c.getRadius() * c.getRadius();
            } else if (shapeList[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapeList[i];
                totalArea += r.getLength() * r.getWidth();
            }
            shapeCount++;
        }

        return shapeCount > 0 ? totalArea / shapeCount : 0;
    }

    public void removeAllRects() {
        int newNbShapes = 0;
        Shape[] newShapeList = new Shape[shapeList.length];

        for (int i = 0; i < nbShapes; i++) {
            if (!(shapeList[i] instanceof Rectangle)) {
                newShapeList[newNbShapes++] = shapeList[i];
            }
        }

        shapeList = newShapeList;
        nbShapes = newNbShapes;
    }

    public void displayRectsInfo() {
        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Rectangle) {
                System.out.println(shapeList[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nbShapes; i++) {
            sb.append(shapeList[i]).append("\n");
        }
        return sb.toString();
    }
}

