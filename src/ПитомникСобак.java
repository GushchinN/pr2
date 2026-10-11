import java.util.Scanner;

public class ПитомникСобак {
    private Dog[] dogs;
    private int count;

    public ПитомникСобак(int size){
        dogs = new Dog[size];
        count = 0;
    }

    public void add(Dog dog){
        if(count < dogs.length){
            dogs[count] = dog;
            count++;
            System.out.println("Собака добавлена");
        } else {
            System.out.println("Питомник заполнен");
        }
    }

    public void printAll(){
        if(count == 0){
            System.out.println("Питомник пуст");
            return;
        }
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + dogs[i].toString());
        }
    }

    public int getCount(){return count;}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вместимость питомника: ");
        int size = sc.nextInt();
        sc.nextLine();
        ПитомникСобак питомник = new ПитомникСобак(size);

        System.out.print("Сколько собак добавить: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Собака " + (i + 1) + ":");
            System.out.print("Кличка: ");
            String name = sc.nextLine();
            System.out.print("Возраст: ");
            int age = sc.nextInt();
            sc.nextLine();
            питомник.add(new Dog(name, age));
        }

        System.out.println("\nВсе собаки в питомнике (" + питомник.getCount() + "):");
        питомник.printAll();
    }
}
