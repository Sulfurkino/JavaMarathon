package day11;

public class Courier implements Worker {
    int salary = 100;
    private int totalSalary = 0;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        totalSalary+=salary;
        warehouse.setBalance(warehouse.getBalance()+1000);


    }

    @Override
    public void bonus() {
        if (warehouse.getBalance()>=1000000){
            salary *=2;
        }

    }


}
