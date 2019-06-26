// TODO: Создать двумерный массив целых чисел 5x5. Вывести на экран все числа, которые больше 20
import java.util.Random;

public class Task3 {
    static final int STRING_NUMBER = 5;
    static final int COLUMN_NUMBER = 7;

    public static void main(String[] args) {
        int[][] matrix = new int[STRING_NUMBER][COLUMN_NUMBER];
        for (int i = 0; i < STRING_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                int someRandom = new Random().nextInt(100);
                matrix[i][j] = someRandom;
            }
        }
        for (int i = 0; i < STRING_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < STRING_NUMBER; i++) {
            for (int j = 0; j < COLUMN_NUMBER; j++) {
                if (matrix[i][j] > 20) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


}
