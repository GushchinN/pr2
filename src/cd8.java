import java.util.Scanner;

public class cd8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n / 2; i++) {
            int cnt = n - 1 - i;
            String arri = arr[i];
            arr[i] = arr[cnt];
            arr[cnt] = arri;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
