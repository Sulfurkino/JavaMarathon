package day10;

import java.util.Scanner;

//int[] array = {1, 2, 3, 4, 5};
//int index = 2;
//int[] newArray = new int[array.length - index];
//System.arraycopy(array, index, newArray, 0, newArray.length);


public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int start = 0;
        int end = array.length;
        int middle =start + (end - start)/2;

        int number = scanner.nextInt();

        while (start<=end){
            if (number == array[middle]){
                System.out.println(number);
            } else if (number>array[middle]) {
                start = middle+1;

            } else if (number<array[middle]) {
                end = middle-1;
            }

        }


    }

}

