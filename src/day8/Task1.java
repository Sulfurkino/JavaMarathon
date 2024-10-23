package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String stringNums = new String();
        for (int i = 0; i <= 20000; i++) {
            stringNums += i + " ";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения первого метода: " + (endTime - startTime) + " мс");



        String stringNums2 = new String();
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения второго метода: " + (endTime2 - startTime2) + " мс");

        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);





    }
}
