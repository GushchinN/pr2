import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Первая окружность:");
        System.out.print("Введите x центра: ");
        double x1 = sc.nextDouble();
        System.out.print("Введите y центра: ");
        double y1 = sc.nextDouble();
        System.out.print("Введите радиус: ");
        double r1 = sc.nextDouble();
        Circle c1 = new Circle(x1, y1, r1);

        System.out.println("Вторая окружность:");
        System.out.print("Введите x центра: ");
        double x2 = sc.nextDouble();
        System.out.print("Введите y центра: ");
        double y2 = sc.nextDouble();
        System.out.print("Введите радиус: ");
        double r2 = sc.nextDouble();
        Circle c2 = new Circle(x2, y2, r2);

        System.out.println("\n" + c1.toString());
        System.out.println("площадь = " + c1.getArea());
        System.out.println("длина окружности = " + c1.getLength());

        System.out.println("\n" + c2.toString());
        System.out.println("площадь = " + c2.getArea());
        System.out.println("длина окружности = " + c2.getLength());

        System.out.print("\nВведите новый радиус первой окружности: ");
        double nr = sc.nextDouble();
        c1.setRadius(nr);
        System.out.println(c1.toString());
        System.out.println("новая площадь = " + c1.getArea());
        System.out.println("новая длина = " + c1.getLength());

        int cmp = c1.compare(c2);
        if(cmp > 0) System.out.println("\nПервая окружность больше второй");
        else if(cmp < 0) System.out.println("\nПервая окружность меньше второй");
        else System.out.println("\nОкружности равны по радиусу");
    }
}
