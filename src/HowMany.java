import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = sc.nextLine();

        Scanner words = new Scanner(line);
        int cnt = 0;
        while (words.hasNext()) {
            words.next();
            cnt++;
        }

        System.out.println("Количество слов: " + cnt);
    }
}
