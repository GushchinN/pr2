import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Poker {
    public static void main(String[] args) {
        ArrayList<String> koloda = new ArrayList<>(Arrays.asList("A♠", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♥", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♦", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♣", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣"));
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = koloda.size() - 1;
        int cnt = -1;
        System.out.print("Введите количество игроков(не больше 9): ");
        int plr = sc.nextInt() * 5;

        if(plr > 45){
            System.err.print("Количество игроков не должно превышать 9");
            System.exit(0);
        }

        for (int i = 0; i < plr; i++) {
            cnt += 1;
            int random = min + (int) (Math.random() * (max - min + 1));

            if (cnt < 5) {
                System.out.print(koloda.get(random) + " ");
                koloda.remove(random);
                max -= 1;
            }

            else {
                System.out.print("\n" + "\n");
                System.out.print(koloda.get(random) + " ");
                koloda.remove(random);
                max -= 1;
                cnt = 0;
            }
        }
    }
}