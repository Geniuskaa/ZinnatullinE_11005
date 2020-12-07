package HomeWork_27_11;

public class Rectangle extends Shape{
    private int length;
    private int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь прямоугольника равна: " + this.length * this.width);
    }
}
