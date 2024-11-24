package org.example;

class Circle extends Shape {
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean contains(Point p) {
        return center.distanceTo(p) <= radius;
    }

    @Override
    public String toString() {
        return "Circle [Center: " + center.toString() + ", Radius: " + radius + "]";
    }
}

