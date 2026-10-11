import java.util.Scanner;

public class TestShop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вместимость магазина: ");
        int size = sc.nextInt();
        sc.nextLine();
        Shop shop = new Shop(size);

        boolean work = true;
        while(work){
            System.out.println("\n1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти по марке");
            System.out.println("4. Найти по модели");
            System.out.println("5. Показать все");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Марка: ");
                    String brand = sc.nextLine();
                    System.out.print("Модель: ");
                    String model = sc.nextLine();
                    System.out.print("Цена: ");
                    double price = sc.nextDouble();
                    System.out.print("ОЗУ (ГБ): ");
                    int ram = sc.nextInt();
                    sc.nextLine();
                    shop.add(new Computer(brand, model, price, ram));
                    break;
                case 2:
                    System.out.print("Марка для удаления: ");
                    String delBrand = sc.nextLine();
                    System.out.print("Модель для удаления: ");
                    String delModel = sc.nextLine();
                    shop.remove(delBrand, delModel);
                    break;
                case 3:
                    System.out.print("Марка для поиска: ");
                    String findBrand = sc.nextLine();
                    Computer found1 = shop.findByBrand(findBrand);
                    if(found1 != null) System.out.println(found1.toString());
                    else System.out.println("Не найдено");
                    break;
                case 4:
                    System.out.print("Модель для поиска: ");
                    String findModel = sc.nextLine();
                    Computer found2 = shop.findByModel(findModel);
                    if(found2 != null) System.out.println(found2.toString());
                    else System.out.println("Не найдено");
                    break;
                case 5:
                    shop.printAll();
                    break;
                case 0:
                    work = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
