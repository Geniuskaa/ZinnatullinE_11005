package HomeWork_27_11;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getArea() {
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            double p = (side1 + side2 + side3) / 2;
            double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
            System.out.println("Площадь треугольника равна: " + s);
        }else{
            System.out.println("Такого треугольника не существует!");
        }

    }
}
