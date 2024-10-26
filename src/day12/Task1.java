package day12;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();


        cars.add("Mercedes");
        cars.add("honda");
        cars.add("shkoda");
        cars.add("toyota");
        cars.add("bmx");

        int middleIndex = cars.size() / 2;
        cars.add(middleIndex, "Audi");

        cars.remove(0);

        System.out.println(cars);


    }
}
