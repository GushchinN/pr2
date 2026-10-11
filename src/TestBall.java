import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ball ball1 = new Ball(1.3, 1.6);
        System.out.println("Начальное положение: x = " + ball1.getX() + " y = " + ball1.getY());

        System.out.print("Введите новые x и y:");
        double nx = sc.nextDouble();
        ball1.setX(nx);
        double ny = sc.nextDouble();
        ball1.setY(ny);
        System.out.println(ball1.toString());

        System.out.print("Введите новые x и y:");
        nx = sc.nextDouble();
        ny = sc.nextDouble();
        ball1.setXY(nx, ny);
        System.out.println(ball1.toString());

        Ball ball2 = new Ball();
        System.out.println("Новый мяч: x = " + ball2.getX() + " y = " + ball2.getY());
        System.out.print("Введите изменения x и y нового мяча: ");
        double nnx = sc.nextDouble();
        double nny = sc.nextDouble();
        ball2.move(nnx, nny);
        System.out.println("Новые координаты второго мяча: x = "+ ball2.getX() + " y = " + ball2.getY());


    }

}