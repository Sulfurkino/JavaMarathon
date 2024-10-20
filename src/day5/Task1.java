package day5;

public class Task1 {
    public static void main(String[] args) {
        Task1Car car = new Task1Car();
        car.setYear(2020);
        car.setColor("Red");
        car.setModel("Model 3");

        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Model: " + car.getModel());
    }
}
