package day6;

public class Task2 {
    public static void main(String[] args) {
//        Создать новый объект класса Самолет с произвольными данными.
//        Изменить год выпуска и длину с помощью сеттеров, вызвать метод f​illUp() ​два
//        раза, передав разные значения. Вызвать метод i​nfo()​.

        Airplane boing = new Airplane("Boing corp", 2018, 200, 300 ){

        };
        boing.setYear(2020);
        boing.setLength(800);
        boing.setProducer("Turk airlines");
        boing.setWeight(2000);
        boing.fillUp(5);
        boing.fillUp(8);
        boing.info();


    }
}
