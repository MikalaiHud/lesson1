import java.util.Random;
// TODO: Сортировака выбором
public class Task5 {
    public static void main(String[] args) {
        int[] dom = new int[10];
        System.out.print("[ ");
        for (int i = 0; i < dom.length; i++) {
            int someRandom = new Random().nextInt(20);
            dom[i] = someRandom;
            System.out.print(dom[i] + " ");
        }
        System.out.println("]");
        selectionSort(dom);
        System.out.print("[ ");
        for (int i = 0; i < dom.length; i++) {
            System.out.print(dom[i] + " ");
        }
        System.out.println("]");
    }

    private static void selectionSort(int[] dom) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < dom.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = findMinIndex(i, dom);
            // Swap the found minimum element with the first
            // element
            int temp = dom[min_idx];
            dom[min_idx] = dom[i];
            dom[i] = temp;
        }
    }

    private static int findMinIndex(int i, int[] dom) {
        int min_idx = i;
        for (int j = i + 1; j < dom.length - 1; j++) {
            if (dom[j] < dom[min_idx]) {
                min_idx = j;
            }
        }
        return min_idx;
    }


}

