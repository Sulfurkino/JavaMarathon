package day9;

public class Rectangle extends Figure{

    int c;
    int d;

    public Rectangle(String color, int c, int d) {
        super(color);
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        double area = c * d;

        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (c + d);

        return perimeter;
    }
}
