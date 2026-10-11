import java.util.Scanner;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size){
        circles = new Circle[size];
        count = 0;
    }

    public void add(Circle c){
        if(count < circles.length){
            circles[count] = c;
            count++;
        } else {
            System.out.println("Массив заполнен");
        }
    }

    public void printAll(){
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + circles[i].toString());
            System.out.println("   площадь = " + circles[i].getArea());
            System.out.println("   длина окружности = " + circles[i].getLength());
        }
    }

    public int getCount(){return count;}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива окружностей: ");
        int size = sc.nextInt();
        Tester tester = new Tester(size);

        for(int i = 0; i < size; i++){
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.print("Введите x центра: ");
            double x = sc.nextDouble();
            System.out.print("Введите y центра: ");
            double y = sc.nextDouble();
            System.out.print("Введите радиус: ");
            double r = sc.nextDouble();
            tester.add(new Circle(x, y, r));
        }

        System.out.println("\nВсе окружности (" + tester.getCount() + "):");
        tester.printAll();
    }
}
