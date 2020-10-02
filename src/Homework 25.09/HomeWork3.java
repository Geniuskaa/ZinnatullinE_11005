import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int s = in.nextInt();
        System.out.println("Введите длину столбца: ");
        int c = in.nextInt();
        int[][] matrix1 = new int[s][c];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = ((int) (Math.random() * 10));
                System.out.println("Позиция элемента: " + i + j + matrix1[i][j]);
            }
        }

        int[][] a = matrix1;
        if (s == c & s == 2) {
            int opredelitel2X2 = a[0][0] * a[1][1] - a[0][1] * a[1][0];
            System.out.println(opredelitel2X2);
        }

        if (s == c & s == 3) {
            int sum = a[0][0] * a[1][1] * a[2][2] + a[0][2] * a[1][0] * a[2][1] + a[0][1] * a[1][2] * a[2][0];
            int opredelitel3X3 = sum - a[0][2] * a[1][1] * a[2][0] - a[0][0] * a[1][2] * a[2][1] - a[0][1] * a[1][0] * a[2][2];
            System.out.println(opredelitel3X3);
        }
    }
}
