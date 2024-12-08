package source;

public class Ellipse extends Shape implements Eccentricable{
    private double a,b;
    double peri,ar,e;

    public Ellipse(double a, double b){
        if(a<b) {
            this.a = b;
            this.b = a;
        }
        else {
            this.a=a;
            this.b=b;
        }
    }

    public double perimeter(){
        double s1 = (a*a)+(b*b);
        double s2= (a-b)*(a-b);
        peri=Math.PI * Math.sqrt(2*s1-s2/2);
        return peri;
    }

    public double area(){
        ar = Math.PI * a * b;
        return ar;
    }

    public double eccentricity(){
        e = Math.sqrt(1-(b*b)/(a*a));
        return e;
    }

    public String toString(){
        return "Ellipse\nArea= " +area()+ "\nPerimeter= " +perimeter()+ "\nEccentricity= " +eccentricity();
    }
}

