package day4;

import java.lang.reflect.Array;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] arrayMatrix = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrayMatrix[i][j] = random.nextInt(51);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayMatrix[i][j] + " ");
            }
            System.out.println();
        }


        int maxSum = 0;
        int maxSumIndex = 0;


        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arrayMatrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }


        System.out.println("Индекс строки с максимальной суммой чисел: " + maxSumIndex);


    }
}
