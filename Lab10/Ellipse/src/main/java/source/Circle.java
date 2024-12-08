package source;

    public class Circle extends Ellipse {

        public Circle(double radius) {
            super(radius, radius);
        }
        @Override
        public String toString() {
            return "Circle\nArea= " + area() + "\nPerimeter= " + perimeter() + "\nEccentricity= " + eccentricity();
        }
    }


