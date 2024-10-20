package day7;

import java.util.Random;

public class Player {
    Random random = new Random();

    private int stamina = random.nextInt(11) + 90;

    private static final int maxStamina = 100;
    private static final int minStamina = 0;

    private static int playersCount = 0;

    public static int getPlayersCount() {
        return playersCount;
    }

    public int getStamina() {
        return stamina;
    }

    public Player() {
        playersCount++;

        if (playersCount > 6) {
            System.out.println("Нельзя добавить игрока, на поле нет мест");
            playersCount = 6;
        }


    }

    public void run() {
        stamina -= 1;
        if (stamina == 1) {
            System.out.println("Игрок вот вот устанет");
        } else if (stamina == minStamina) {
            System.out.println("Этот игрок устал и уходит с поля");
            playersCount--;


        } else if(stamina<minStamina) {
            System.out.println("Игрок сидит на скамейке и не может играть");
            stamina = 0;
        }
    }

    public static void info() {
        if (playersCount < 6) {
            System.out.println("Команды неполные. На поле еще есть" + (6 - playersCount) + "свободных мест");
        } else if (playersCount == 6) {

            System.out.println("На поле нет свободных мест");

        }
    }
}


