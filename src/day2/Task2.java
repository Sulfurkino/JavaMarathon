package day2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа, первое меньше второго");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("некорректный ввод");
            return;
        }


        for (int i = 0; i < b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.println(i);


            }


        }

    }
}