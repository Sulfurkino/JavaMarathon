package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
//        максимальной суммой выведите значение суммы и индекс первого элемента тройки.

        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000)+1;
        }

        int maxSum = 0;
        int sum = 0;
        int index = 0;


        for (int i = 0; i < array.length - 2 ; i += 3) {
            sum = array[i] + array[i+1] + array[i+2];
            if(sum >maxSum){
                maxSum = sum;
                index = i;
            }

        }

        System.out.println("Самая большая сумма равна " + maxSum + ", а индекс первого числа этой суммы равен " + index);
    }
}
