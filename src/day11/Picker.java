package day11;

public class Picker implements Worker {
    int salary = 80;
    private int totalSalary=0;
    private Warehouse warehouse;


    public int getSalary() {
        return salary;
    }


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        totalSalary += salary;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder()>=1500){
            salary *=3;
        }

    }
}
