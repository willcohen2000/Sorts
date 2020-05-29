public class SelectionSort extends Sort {

    public SelectionSort() {
        super(-1, "Selection Sort", "O(n^2)");
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            if (min != i) {
                int minVal = arr[min];
                arr[min] = arr[i];
                arr[i] = minVal;
            }
        }
        return arr;
    }

}
