package day2;

import java.util.Optional;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Optional.of("name")
                .map(s -> s.getBytes())
                .get();

        Scanner scanner = new Scanner(System.in);
        System.out.println("put x number here");
        double x = scanner.nextDouble();


        if (x>=5){
            System.out.println((Math.pow(x,2)-10)/(x+7));
            return;
        }
        if (-3<x && x<5) {
            System.out.println((x+3)*(Math.pow(x,2)-2));
            return;
        }

        System.out.println(420);

    }



}
