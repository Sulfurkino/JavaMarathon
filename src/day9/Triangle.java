package day9;

public class Triangle extends Figure {


    int a;
    int b;
    int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }


    @Override
    public double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
