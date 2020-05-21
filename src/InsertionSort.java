public class InsertionSort extends Sort {

    public InsertionSort() {
        super(-1, "Insertion Sort", "O(n^2)");
    }

    public static int[] sort(int[] arr) {
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int arrj = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = arrj;
                }
            }
        }
        long finish = System.nanoTime();
        System.out.println("runtime: " + ((finish - start) * Math.pow(10, -9)));
        return arr;
    }


}


