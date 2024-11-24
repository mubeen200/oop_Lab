package org.example;

public class Main {
    public static void main(String[] args) {
        // Create ShapesArray with a size of 20
        ShapeArray shapes = new ShapeArray(20);

        // 1. Add new shapes
        System.out.println("Adding shapes...");
        Circle circle1 = new Circle(new Point(5, 5), 10);
        Circle circle2 = new Circle(new Point(15, 15), 5);
        Rectangle rect1 = new Rectangle(new Point(10, 10), 20, 10);
        Rectangle rect2 = new Rectangle(new Point(0, 0), 15, 5);

        shapes.addShape(circle1);
        shapes.addShape(circle2);
        shapes.addShape(rect1);
        shapes.addShape(rect2);

        // Display added shapes
        System.out.println("Shapes added:");
        System.out.println(shapes);

        // 2. Display all rectangles
        System.out.println("Displaying all rectangles:");
        shapes.displayRectsInfo();

        // 3. Display the average shapes area
        double avgArea = shapes.getAvgAreas();
        System.out.println("Average area of all shapes: " + avgArea);

        // 4. Display the number of circles
        int numCircles = shapes.getCircleCounter();
        System.out.println("Number of circles: " + numCircles);

        // 5. Remove all rectangles
        System.out.println("Removing all rectangles...");
        shapes.removeAllRects();
        System.out.println("Remaining shapes after removing rectangles:");
        System.out.println(shapes);
    }
}
