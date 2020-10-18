import java.util.ArrayList;

public class HomeWork_23_10 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        System.out.println("Сумма чисел равна: " + recursiveSum(n, sum));

        int a = 33;
        int b = 37;
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        listOfNums = recursiveSout(a, b, listOfNums);
        System.out.println("Числа от А до В: " + listOfNums);

        int sumForPhib = 1;
        int temporarySum = 1;
        int m = 7;
        System.out.println("Число Фибоначчи " + m + " равно: " + phibonanchi(m, sumForPhib, temporarySum));

        int q = 4; // Если больше 3х то вылетает ошибка, (4,0) принимает
        int r = 0; // Если больше 12, при (3,12) то вылетает ошибка
        System.out.println("Значение функции аккермана: " + akkerman(q, r));

    }

    // Рекурсивно посчитать произведение чисел от 1 до N.
    public static int recursiveSum(int n, int sum) {
        sum += n;
        if (n < 1) {
            return sum;
        }
        return recursiveSum(n - 1, sum);
    }

    // Рекурсивно вывести целые числа от A до B (A < B)
    public static ArrayList recursiveSout(int a, int b, ArrayList list) { // A < B, вычитаем из B A
        if (a == b - 1) {
            return list;
        }
        list.add(a++);
        return recursiveSout(a, b, list); // тут любое изменение переменной не учтётся
    }

    // Числа Фибоначчи
    public static int phibonanchi(int n, int summ, int tempSum) {
        if (n == 2) {
            return summ;
        }
        int bridge = 0;
        bridge = summ;
        summ += tempSum;
        tempSum = bridge;
        n--;
        return phibonanchi(n, summ, tempSum);
    }

    // Функция Аккермана
    public static int akkerman(int M, int N) {

        if (M == 0) {
            return N + 1;
        }

        if (M > 0 && N == 0) {
            M--;
            return akkerman(M, 1);
        }

        if (M > 0 && N > 0) {
            int tempM = M;
            M--;
            N--;
            return akkerman(M, akkerman(tempM, N));
        }
        return 0;
    }




}
