package day7;

public class Task2 {
    public static void main(String[] args) {

        Player NUMBER1 = new Player();
        Player NUMBER2 = new Player();
        Player NUMBER3 = new Player();
        Player NUMBER4 = new Player();
        Player NUMBER5 = new Player();
        Player num6 = new Player();
        Player num7 = new Player();

        Player.info();
        System.out.println("количество игроков на поле - " + Player.getPlayersCount());
        System.out.println(num6.getStamina());


        num6.run();

        System.out.println(num6.getStamina());





    }
}
