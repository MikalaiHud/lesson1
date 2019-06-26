import java.util.Random;

/**
 * TODO: Соритровка Пузырьком, сортировка выбором, сортировка вставкой, быстрая сортировка
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Before:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int someRandom = new Random().nextInt(50);
            array[i] = someRandom;
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        bubbleSort(array);
        System.out.println("After:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] bum) {
        for (int i = 0; i < bum.length - 1; i++) {
            for (int j = 0; j < bum.length - i - 1; j++) {
                if (bum[j] > bum[j + 1]) {
                    int m = bum[j];
                    bum[j] = bum[j + 1];
                    bum[j + 1] = m;
                }
            }
        }
    }

}
