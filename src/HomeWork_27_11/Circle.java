package HomeWork_27_11;

public class Circle extends Shape {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double square = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + square);
    }
}
