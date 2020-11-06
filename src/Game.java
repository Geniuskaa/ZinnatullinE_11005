import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int damage = 0;

        Player player1 = new Player("Alex", 10);
        Player player2 = new Player("Oleg", 10);


        while (player1.getHp() > 0 && player2.getHp() > 0) {
            System.out.println("Ход 1-го игрока!");
            System.out.print("Введите силу удара от 0 до 9: ");
            damage = in.nextInt();
            player1.hit(damage);
            System.out.println(player1.getHp());

            System.out.println("Ход 2-го игрока!");
            System.out.print("Введите силу удара от 0 до 9: ");
            damage = in.nextInt();
            player2.hit(damage);
            System.out.println(player2.getHp());
        }

        if (player1.getHp() <= 0) {
            System.out.println("Player2 won!");
        }

        if (player2.getHp() <= 0) {
            System.out.println("Player1 won!");
        }

    }
}
