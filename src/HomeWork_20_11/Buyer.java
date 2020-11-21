package HomeWork_20_11;

public class Buyer {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    private String gender;

    Buyer(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display(){
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
        System.out.println("Пол: " + this.gender);
    }

    public String getName() {
        return name;
    }
}
