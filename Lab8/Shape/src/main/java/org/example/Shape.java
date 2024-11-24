package org.example;

class Shape {
    protected Point center;

    public Shape(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public boolean contains(Point p) {
        return false;
    }

    @Override
    public String toString() {
        return "Shape [Center: " + center.toString() + "]";
    }
}


