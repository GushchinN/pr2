public class Shop {
    private Computer[] computers;
    private int count;

    public Shop(int size){
        computers = new Computer[size];
        count = 0;
    }

    public void add(Computer c){
        if(count < computers.length){
            computers[count] = c;
            count++;
            System.out.println("Компьютер добавлен");
        } else {
            System.out.println("Магазин заполнен");
        }
    }

    public void remove(String brand, String model){
        for(int i = 0; i < count; i++){
            if(computers[i].getBrand().equalsIgnoreCase(brand) && computers[i].getModel().equalsIgnoreCase(model)){
                for(int j = i; j < count - 1; j++){
                    computers[j] = computers[j + 1];
                }
                computers[count - 1] = null;
                count--;
                System.out.println("Компьютер удалён");
                return;
            }
        }
        System.out.println("Компьютер не найден");
    }

    public Computer findByBrand(String brand){
        for(int i = 0; i < count; i++){
            if(computers[i].getBrand().equalsIgnoreCase(brand)){
                return computers[i];
            }
        }
        return null;
    }

    public Computer findByModel(String model){
        for(int i = 0; i < count; i++){
            if(computers[i].getModel().equalsIgnoreCase(model)){
                return computers[i];
            }
        }
        return null;
    }

    public void printAll(){
        if(count == 0){
            System.out.println("Магазин пуст");
            return;
        }
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + computers[i].toString());
        }
    }

    public int getCount(){return count;}
}
