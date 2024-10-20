package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = 1;

        while (b!=0){
            System.out.println("ведите делимое и делитель");

            double a = scanner.nextDouble();
             b = scanner.nextDouble();
            double c = a/b;

            System.out.println(c);

        }



    }

}
