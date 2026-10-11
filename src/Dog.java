public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(){
        this.name = "Без имени";
        this.age = 0;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public int toHumanAge(){
        return age * 7;
    }

    @Override
    public String toString(){
        return "Dog{" + "кличка: " + name + ", возраст: " + age + ", в человеческих: " + toHumanAge() + "}";
    }
}
