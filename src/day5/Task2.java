package day5;

public class Task2 {
    public static void main(String[] args) {
        Task2Motorbike motorbike = new Task2Motorbike(2019, "Black", "Harley");

        System.out.println("Year: " + motorbike.getYear());
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Model: " + motorbike.getModel());
    }
}
