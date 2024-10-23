package day9;

public class Circle extends Figure {



    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        double area = Math.PI * radius * radius; // площадь


        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * radius; // периметр
        return perimeter;
    }
}
