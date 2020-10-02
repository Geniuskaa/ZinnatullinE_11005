import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int s = in.nextInt();
        System.out.println("Введите длину столбца: ");
        int c = in.nextInt();
        int[][] matrix1 = new int[s][c];
        int i, j;

        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = ((int) (Math.random() * 10));
                System.out.println("Позиция элемента: " + i + j + matrix1[i][j]);
            }
        }

        int[][] posrednik = new int[1][c];
        for (i = 0; i < s - 1; i++) {
            for (j = 1; j < s; j++) {
                if (matrix1[i][0] > matrix1[j][0]) {

                    posrednik[0][0] = matrix1[i][0];
                    posrednik[0][1] = matrix1[i][1];
                    posrednik[0][2] = matrix1[i][2];

                    matrix1[i][0] = matrix1[j][0];
                    matrix1[i][1] = matrix1[j][1];
                    matrix1[i][2] = matrix1[j][2];

                    matrix1[j][0] = posrednik[0][0];
                    matrix1[j][1] = posrednik[0][1];
                    matrix1[j][2] = posrednik[0][2];
                    // Поменять местами текущую i и j
                }
            }

        }
        System.out.println("New args: ");
        for (i = 0; i < matrix1.length; i++) {
            for (j = 0; j < matrix1[i].length; j++) {
                System.out.println("Позиция элемента: " + i + j + matrix1[i][j]);
            }
        }

    }
}
