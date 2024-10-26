package day11;

public class Task {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(0, 0);
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);

        for (int i = 0; i < 1501; i++) {
            picker1.doWork();
        }
        for (int i = 0; i < 1001; i++) {
            courier1.doWork();
        }
        picker1.bonus();
        courier1.bonus();


        Warehouse warehouse2 = new Warehouse(0,0);
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        picker2.doWork();
        courier2.doWork();




        System.out.println(warehouse1);
        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

        System.out.println(warehouse2);
        System.out.println(picker2.getSalary());
        System.out.println(courier2.getSalary());



    }
}
