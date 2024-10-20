package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("Длина массива:" + array.length);

        int countMoreEight = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8){
                countMoreEight ++;
            }
        }

        System.out.println("Количество чисел больше восьми:" + countMoreEight);

        int countMoreOne = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                countMoreOne ++;
            }
        }

        System.out.println("количество чисел равных 1: " + countMoreOne);

        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0)
                countEven ++;

        }
        System.out.println("number of even numbers:" + countEven);

        int countOdd =0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0)
                countOdd++;

        }
        System.out.println("number of odd numbers:" + countEven);

        int thesum = 0;

        for (int i = 0; i < array.length; i++) {
            thesum += array[i];
        }

        System.out.println("Сумма всех чисел равна: " + thesum);


    }
}