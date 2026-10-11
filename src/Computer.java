public class Computer {
    private String brand;
    private String model;
    private double price;
    private int ram;

    public Computer(String brand, String model, double price, int ram){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}
    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price = price;}
    public int getRam(){return ram;}
    public void setRam(int ram){this.ram = ram;}

    @Override
    public String toString(){
        return "Computer{" + "марка: " + brand + ", модель: " + model + ", цена: " + price + ", ОЗУ: " + ram + " ГБ}";
    }
}
