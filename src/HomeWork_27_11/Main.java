package HomeWork_27_11;

public class Main {
    public static void main(String[] args){
        Shape[] obj = new Shape[10];
        randValues(obj);
        for (Shape cout: obj) {
            cout.getArea();
        }

    }

    public static void randValues(Shape[] array){
        int i = 0;
        for (; i < 4; i++){
            array[i] = new Circle(Math.random() * 10);
        }
        
        for (int j = i - 1; i < array.length - j; i++){
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            array[i] = new Rectangle(a, b);
        }

        for (; i < array.length; i++){
            array[i] = new Triangle(Math.random() * 10, Math.random() * 10, Math.random() * 10);

        }

    }
}
