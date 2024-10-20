package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        int[] array = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }

        // Вывод массива с использованием for-each
        for (int number : array) {
            System.out.println(number);
        }
        int biggestNum = 0;
        for (int number : array) {
            if (number>biggestNum){
                biggestNum = number;
            }

        }
        System.out.println("наибольшее число - " + biggestNum );

        int smallestNum = 10001;
        for (int number : array) {
            if (number < smallestNum){
                smallestNum = number;
            }

        }
        System.out.println("наибольшее число - " + smallestNum );

        int countZeroEndNum = 0;

        for (int number : array){
            if (number % 10 == 0){
                countZeroEndNum ++;
            }

        }
        System.out.println("кол-во чисел в конце которых 0:" + countZeroEndNum);

        int sumZeroEndNum = 0;

        for (int number : array){
            if (number % 10 == 0){
                sumZeroEndNum += number;
            }

        }
        System.out.println("сумма чисел в конце которых 0:" + sumZeroEndNum);


    }
}
