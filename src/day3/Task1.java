package day3;
import java.util.Scanner;
public class Task1 {
    //1 Реализовать программу, которая в консоль выводит название страны, принимая на
    //вход название города. Программа должна работать до тех пор, пока не будет введено
    //слово “Stop”.
    //Реализовать, используя следующие данные:
    //Москва, Владивосток, Ростов - Россия
    //Рим, Милан, Турин - Италия
    //Ливерпуль, Манчестер, Лондон - Англия
    //Берлин, Мюнхен, Кёльн - Германия
    //При вводе любого другого города, вывести сообщение “Неизвестная страна”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        switch (city){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Германия");
            case "Stop":
                break;
            default:
                System.out.println("Неизвестная страна");
        }

    }
}
