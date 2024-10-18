package day6;

import java.util.Scanner;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Airplane(String producer, int year, int length, int weight) {
        fuel = 0;
        this.producer = producer;
        this.year = year;
        this.weight = weight;
        this.length = length;


    }

    public void info() {
        System.out.println("Изготовитель: " + producer +
                "год выпуска: " + year + "длина: " + length +
                "вес: " + weight + "количество топлива в баке:" + fuel);
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int fuelLiters){
        fuel += fuelLiters;

    }


}
