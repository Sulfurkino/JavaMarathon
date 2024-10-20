package day6;

public class Task1 {

    public static void main(String[] args) {
        Task1Car mercedes = new Task1Car();
        mercedes.setColor("black");
        mercedes.setModel("bmx");
        mercedes.setYear(2020);

        System.out.println(mercedes.yearDifference(2024));

    }




}
