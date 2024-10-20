package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа, первое меньше второго");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a + 1;


        if (a >= b) {
            System.out.println("ошибка ввода");
            return;
        }
            while (c < b) {

                if (c % 5 == 0 && c % 10 != 0) {
                    System.out.println(c);
                }
                c++;

            }



    }


}
