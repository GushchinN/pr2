import java.util.Scanner;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Author oleg = new Author("Олег", "olegnoob@email.com",'M');

        System.out.println("имя: " + oleg.getName());
        System.out.println("почта: " + oleg.getEmail());
        System.out.println("пол: " + oleg.getGender());

        System.out.print("Введите новую почту: ");
        String onem = sc.nextLine();
        oleg.setEmail(onem);

        System.out.println(oleg.toString());
    }
}
