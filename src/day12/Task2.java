package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                nums.add(String.valueOf(i));
            }
        }
        for (int i = 350; i <= 500; i++) {
            if (i % 2 == 0) {
                nums.add(String.valueOf(i));
            }
        }

        System.out.println(nums);
    }
}
