package org.example;

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(Point center, int length, int width) {
        super(center);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean contains(Point p) {
        // Calculate boundaries of the rectangle
        int left = center.getX() - width / 2;
        int right = center.getX() + width / 2;
        int top = center.getY() - length / 2;
        int bottom = center.getY() + length / 2;

        return (p.getX() >= left && p.getX() <= right && p.getY() >= top && p.getY() <= bottom);
    }

    @Override
    public String toString() {
        return "Rectangle [Center: " + center.toString() + ", Length: " + length + ", Width: " + width + "]";
    }
}
