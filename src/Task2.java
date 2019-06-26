//import java.util.Random;

import java.util.Random;

//public class Task2 {}

/**
 * TODO: Создать массив из 10 целых чисел. Заполнить его любыми значениями. Вывести максимальный и минимальный элемент массива
 */
public class Task2 {
    public static void main(String[] args) {
        int[] dec = new int[10];
        for (int i = 0; i < dec.length; i += 1) {
            int someRandom = new Random().nextInt(100);
            dec[i] = someRandom;
        }
        System.out.print("[");
        for (int i = 0; i < dec.length; i++) {
            System.out.print(dec[i] + "  ");
        }
        System.out.println("]");
        System.out.println("maxElement = " + findMax(dec));
        System.out.println("minElement = " + findMin(dec));
    }


    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
//public static void main(String[] args) {}


//public static int findMax(int[] array) {}


