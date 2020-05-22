import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort extends Sort {

    public QuickSort() {
        super(-1, "Quick Sort", "O(nlog(n))");
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(arr, lo, hi);
        quickSort(arr, lo, j - 1);
        quickSort(arr, j + 1, hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (arr[++i] < arr[lo]) {
                if (i == hi)
                    break;
            }
            while (arr[lo] < arr[--j]) {
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;

            int arrj = arr[j];
            arr[j] = arr[i];
            arr[i] = arrj;
        }

        int arrj = arr[j];
        arr[j] = arr[lo];
        arr[lo] = arrj;

        return j;
    }

    // Fisher - Yates Shuffle taken from  https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
    private static void shuffleArray(int[] arr) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);

            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }

    public static int[] sort(int[] arr) {

        long start = System.nanoTime();

        shuffleArray(arr);
        quickSort(arr, 0, arr.length - 1);

        long finish = System.nanoTime();
        System.out.println("runtime: " + ((finish - start) * Math.pow(10, -9)));

        return arr;
    }

}
