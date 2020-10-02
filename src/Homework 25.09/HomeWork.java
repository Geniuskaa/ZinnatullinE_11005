import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int s = in.nextInt();
        System.out.println("Введите длину столбца: ");
        int c = in.nextInt();
        int[][] matrix1 = new int[s][c];
        int i, j;

        System.out.println("Матрица - 1: ");
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = ((int) (Math.random() * 10));
                System.out.format("%6d ", matrix1[i][j]);
            }
            System.out.println("");
        }


        System.out.println("Введите длину строки: ");
        int s2 = in.nextInt();
        System.out.println("Введите длину столбца: ");
        int c2 = in.nextInt();

        if (c != s2) {
            System.out.println("Матрицы не могут быть перемножены!");
            return;
        }

        int[][] matrix2 = new int[s2][c2];

        System.out.println("Матрица - 2: ");
        for (i = 0; i < matrix2.length; i++) {
            for (j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = ((int) (Math.random() * 10));
                System.out.format("%6d ", matrix2[i][j]);
            }
            System.out.println("");
        }

        int[][] matrix3 = new int[s][c2];

        System.out.println("Матрица - 3: ");
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < c2; j++) {

                for (int r = 0; r < s2; r++) {
                    matrix3[i][j] += matrix1[i][r] * matrix2[r][j];
                }
            }
        }

        for (i = 0; i < matrix3.length; i++) {
            for (j = 0; j < matrix3[0].length; j++) {
                System.out.format("%6d ", matrix3[i][j]);
            }
            System.out.println("");
        }

    }
}
