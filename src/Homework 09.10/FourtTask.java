import java.util.Scanner;

public class FourtTask {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину квадратной матрицы: ");
        int s = in.nextInt();
        int[][] matrix = new int[s][s];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                   k++;
                }
            }
        }

        if ( (s * s)/2 <= k ) {
            System.out.println("Четных чисел достаточно!");
        }
    }
}
