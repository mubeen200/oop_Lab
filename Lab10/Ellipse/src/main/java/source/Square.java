package source;

public class Square extends Shape{
    double sqarea;
    double sqperi;
    double len;

    public Square(double len){
       this.len=len;
    }

    public double area(){
        sqarea=len*len;
        return sqarea;
    }
    public double perimeter(){
        sqperi=4*len;
        return sqperi;
    }

    public String toString(){
        return "Square\nArea= " + area() + "\nPerimeter= " + perimeter();
    }


}
