public class Mergesort extends Sort {

    private int[] values;
    private int[] auxilary;

    public Mergesort() {
        super(-1, "Merge Sort", "O(nlog(n))");
    }

    private void merge(int lo, int mid, int hi) {

        int k = lo;
        int j = mid + 1;
        int x = lo;

        while (x <= hi) {
            if (k <= mid && j <= hi) {
                if (values[k] < values[j]) {
                    auxilary[x] = values[k];
                    k++;
                    x++;
                } else {
                    auxilary[x] = values[j];
                    j++;
                    x++;
                }
            } else if (k <= mid) {
                auxilary[x] = values[k];
                k++;
                x++;
            } else if (j <= hi) {
                auxilary[x] = values[j];
                j++;
                x++;
            }
        }

        for (int i = lo; i <= hi; i++) {
            values[i] = auxilary[i];
        }

    }

    private void mergeSort(int lo, int hi) {
        if (hi - lo == 1) {
            if (values[hi] < values[lo]) {
                int x = values[hi];
                values[hi] = values[lo];
                values[lo] = x;
            }
        } else if (hi - lo == 0) {
            values[hi] = values[hi];
        } else {
            int mid = (hi + lo) / 2;
            mergeSort(lo, mid);
            mergeSort(mid + 1, hi);
            merge(lo, mid, hi);
        }
    }

    public int[] sort(int[] arr) {
        values = arr;
        auxilary = new int[arr.length];

        long start = System.nanoTime();
        mergeSort(0, values.length - 1);
        long finish = System.nanoTime();
        System.out.println("runtime: " + ((finish - start) * Math.pow(10, -9)));

        return values;
    }

}
